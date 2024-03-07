package org.example.springframework.test;

import org.example.springframework.BeanDefinition;
import org.example.springframework.BeanFactory;
import org.example.springframework.test.bean.UserService;
import org.junit.jupiter.api.Test;

public class ApiTest{

    @Test
    public void test_BeanFactory() {
        //初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();
        //注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

    }
}
