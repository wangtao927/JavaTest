package com.sunshine;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangtao on 2018/4/11.
 */
public class ServerStart {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:spring-bean.xml");
        applicationContext.getBean("springBeanTest");
    }
}
