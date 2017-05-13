package com.bysj.rj.config;

import com.alibaba.fastjson.JSON;
import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.stereotype.Controller;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created by Administrator on 2017/4/29 0029.
 */
@Configuration
@ComponentScan(basePackages = {"com.bysj.rj"},excludeFilters = { @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class,WebListener.class})})
@MapperScan("com.bysj.rj.dao")
@EnableTransactionManagement
public class RootConfig {


    @Bean
    public DataSource dataSource() throws Exception{
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://101.201.65.103:3306/bysj?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
//        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/bysj?useUnicode=true&characterEncoding=UTF-8");
//        dataSource.setUsername("root");
//        dataSource.setPassword("123456");
        dataSource.setMaxActive(20);
        dataSource.setInitialSize(0);
        dataSource.setMaxIdle(20);
        dataSource.setMinIdle(1);
        dataSource.setMaxWait(60000);
        return dataSource;
    }
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatisMapper/*Mapper.xml"));
        return sqlSessionFactoryBean;
    }
    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(SqlSessionFactoryBean sqlSessionFactoryBean){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
        mapperScannerConfigurer.setBasePackage("com.bysj.rj.dao");
        return mapperScannerConfigurer;
    }
}
