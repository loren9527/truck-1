package com.bysj.rj.interceptor;

import com.bysj.rj.entity.UserEntity;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @Author: yangliu
 * @Description:
 * @Date: Created in 2017/5/11 0011.
 */
@Aspect
@Component
public class LoginInterceptor {

    private static Logger logger = Logger.getLogger(LoginInterceptor.class);

    @Autowired
    private HttpServletRequest request;
    @Around("execution(* com.bysj.rj.controller.*.*(..)) " +
            "&& @annotation(com.bysj.rj.interceptor.LoginFilter) ")
    public Object preController(ProceedingJoinPoint jp) throws Throwable{
        UserEntity userEntity = (UserEntity) request.getSession().getAttribute("user");
        if(null == userEntity){
            Signature signature =  jp.getSignature();
            Method m = ((MethodSignature) signature).getMethod();
            boolean isAnn = m.isAnnotationPresent(LoginFilter.class);
            LoginFilter filter = null;
            if(isAnn){
                filter = m.getAnnotation(LoginFilter.class);
            }
            Class returnType = ((MethodSignature) signature).getReturnType();
            Object obj = returnType.newInstance();
            if(obj instanceof java.lang.String){
                request.setAttribute("loginInfo","noUser");
                return "page-login";
            }else{
                ModelAndView model = new ModelAndView();
                model.addObject("loginInfo","noUser");
                model.setViewName("page-login");
                return model;
            }
        }else {
            return jp.proceed();
        }
    }
}
