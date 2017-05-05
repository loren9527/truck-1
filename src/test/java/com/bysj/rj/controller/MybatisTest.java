package com.bysj.rj.controller;

import com.alibaba.fastjson.JSON;
import com.bysj.rj.config.RootConfig;
import com.bysj.rj.config.WebConfig;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/4/26 0026.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RootConfig.class,WebConfig.class})
public class MybatisTest {
    private static Logger logger = Logger.getLogger(MybatisTest.class);
    private ApplicationContext ac = null;

//    @Autowired
//    private IService userService = null;

    @Autowired
    private User user;

//	@Before
//	public void before() {
//        logger.info("before");
//		ac = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
//		userService = (IService) ac.getBean("userService");
//	}
//    @Test
//    public void test1() {
//        User user = userService.getUserById(1);
////        // System.out.println(user.getUserName());
////        // logger.info("值："+user.getUserName());
//        logger.info(JSON.toJSONString(user));
//    }

    @Test
    public void test2(){
        logger.info(JSON.toJSONString(user));
    }
}
