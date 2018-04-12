package com.sunshine.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by wangtao on 2018/4/11.
 */
public class SpringBeanTest implements ApplicationContextAware,InitializingBean,BeanPostProcessor, BeanNameAware,BeanFactoryAware, BeanFactoryPostProcessor,
    DisposableBean {


    static {
        System.out.println("static```````````````");
    }
    public SpringBeanTest() {
        System.out.println("constructor`````````````````");
    }
    @Override
    public void setBeanName(String name) {
        System.out.println("setbean name");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("set bean factory ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("set application context");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties ``````````````");
    }


    public void init() {
        System.out.println("init````````````````");
    }

 @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("post process bean factory .....");
    }




    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("post process before init``````````");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("post process after init ``````");
        return null;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("depose destroy ");
    }

    public void destroyMethod() {
        System.out.println("destrory");
    }
}
