package org.example.springframework.test;

import org.example.springframework.bean.UserService;
import org.example.springframework.beans.factory.config.BeanDefinition;
import org.example.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.example.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory(){

        //初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //获取bean
        UserService userService = (UserService) beanFactory.getBean("userService","yttt");
        userService.queryUserInfo();
    }


}
