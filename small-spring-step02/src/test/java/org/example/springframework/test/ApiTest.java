package org.example.springframework.test;

import org.example.springframework.bean.UserService;
import org.example.springframework.beans.factory.config.BeanDefinition;
import org.example.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    public void test_BeanFactory(){
        //初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //注册Bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        //第二次获取bean
        UserService userService_singleto = (UserService) beanFactory.getBean("userService");
        userService_singleto.queryUserInfo();
    }
}
