package com.bysj.rj.config;

import com.alibaba.fastjson.JSON;
import com.bysj.rj.entity.User;
import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Administrator on 2017/4/29 0029.
 */
@Configuration
@ComponentScan(basePackages = {"com.bysj.rj"})
@MapperScan("com.bysj.rj.dao")
@EnableTransactionManagement
public class RootConfig {
    private static Properties properties = new Properties();


    @Bean
    public User user() throws Exception {
        User user = new User();
        user.setPassword("sssssssssss");
        user.setUserName("aaaaaaaaaaa");
        System.out.println(JSON.toJSONString(user));
        return user;
    }
    @Bean
    public DataSource dataSource() throws Exception{
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/shopdb?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("");
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
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sessionFactory");
        mapperScannerConfigurer.setBasePackage("com.bysj.rj.dao");
        return mapperScannerConfigurer;
    }
}
