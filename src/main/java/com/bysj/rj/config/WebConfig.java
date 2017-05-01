package com.bysj.rj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by Administrator on 2017/4/29 0029.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.bysj.rj")
public class WebConfig extends WebMvcConfigurerAdapter{

    private static Properties properties = new Properties();

    @Bean
    public VelocityConfigurer velocityConfig(){
        VelocityConfigurer configurer = new VelocityConfigurer();
        configurer.setResourceLoaderPath("/WEB-INF/views");
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        configurer.setConfigLocation(resolver.getResource("classpath:velocity.properties"));
        return configurer;
    }
    @Bean
    public ViewResolver viewResolver(){
        VelocityViewResolver resolver = new VelocityViewResolver();
        resolver.setCache(false);
        resolver.setSuffix(".html");
        resolver.setContentType("text/html;charset=utf-8");
        resolver.setToolboxConfigLocation("/WEB-INF/toolbox.xml");//tool配置文件路径
        resolver.setExposeSpringMacroHelpers(true);
        resolver.setExposeRequestAttributes(true);//放开request权限
        resolver.setExposeSessionAttributes(true);
        resolver.setAllowSessionOverride(true);
        resolver.setAllowRequestOverride(true);

        resolver.setExposeContextBeansAsAttributes(true);
        resolver.setRequestContextAttribute("ctx");//request属性引用名称
        return resolver;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(){
		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter=new MappingJackson2HttpMessageConverter();
		List<MediaType> list=new ArrayList<MediaType>();
		list.add(MediaType.TEXT_HTML);
		mappingJackson2HttpMessageConverter.setSupportedMediaTypes(list);
		return mappingJackson2HttpMessageConverter;
	}
}
