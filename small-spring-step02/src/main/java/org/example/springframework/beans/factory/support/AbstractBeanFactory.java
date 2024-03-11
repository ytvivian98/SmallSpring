package org.example.springframework.beans.factory.support;

import org.example.springframework.beans.BeansException;
import org.example.springframework.beans.factory.BeanFactory;
import org.example.springframework.beans.factory.config.BeanDefinition;


/**
 * 抽象类定义模板方法
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if(bean != null){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);

    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String name, BeanDefinition beanDefinition) throws  BeansException;

}
