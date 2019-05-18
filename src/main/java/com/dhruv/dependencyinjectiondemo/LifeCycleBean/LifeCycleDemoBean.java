package com.dhruv.dependencyinjectiondemo.LifeCycleBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("Hi!! I am in the LifeCycleBean Constructor");
    }

    @java.lang.Override
    public void destroy() throws Exception {
        System.out.println("## The LifeCycleBean has been terminated");
    }

    @java.lang.Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has its properties set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## My Bean name is"+ name);
    }

    @java.lang.Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## ApplicationContext has been set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## The Post Construct Annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## The Pre Destroy Annotated method has been called");
    }

    public void beforeInit() {
        System.out.println("## BeforeInit - called by Bean Post Processer");
    }

    public void afterInit() {
        System.out.println("## AfterInit - called by Bean Post Processer");
    }
}
