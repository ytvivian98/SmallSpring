package org.example.springframework.beans.factory.config;

import org.example.springframework.beans.BeansException;

public interface BeanPostProcessor {

    /**
     * 在Bean对象执行初始化方法之前，执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在Bean对象执行初始化方法之后执行此方法
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
