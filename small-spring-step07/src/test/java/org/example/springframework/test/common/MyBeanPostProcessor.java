package org.example.springframework.test.common;

import org.example.springframework.bean.UserService;
import org.example.springframework.beans.BeansException;
import org.example.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("userService".equals(beanName)){
         UserService userService = (UserService)bean;
         userService.setLocation("改为：湖南");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
