package org.example.springframework.beans.factory.support;

import org.example.springframework.beans.BeansException;
import org.example.springframework.beans.factory.config.BeanDefinition;


/**
 * 实例化bean类
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {


    @Override
    protected Object createBean(String name, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try{
            bean = beanDefinition.getBeanClass().newInstance();
        }catch (InstantiationException | IllegalAccessException e){
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(name, bean);
        return bean;
    }
}
