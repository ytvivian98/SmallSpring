package org.example.springframework.beans.factory.support;

import org.example.springframework.beans.BeansException;
import org.example.springframework.beans.factory.config.BeanDefinition;
import org.example.springframework.beans.factory.config.BeanPostProcessor;
import org.example.springframework.beans.factory.config.ConfigurableBeanFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * BeanDefinition注册表接口
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements ConfigurableBeanFactory {

    private final List<BeanPostProcessor> beanPostProcessors = new ArrayList<>();

    @Override
    public Object getBean(String name) throws BeansException{
        return doGetBean(name, null);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return (T) getBean(name);
    }

    @Override
    public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor) {
        this.beanPostProcessors.remove(beanPostProcessor);
        this.beanPostProcessors.add(beanPostProcessor);
    }

    public List<BeanPostProcessor> getBeanPostProcessors() {
        return beanPostProcessors;
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException{
        return doGetBean(name, args);
    }

    protected <T> T doGetBean(final String name, final Object[] args){
        Object bean = getSingleton(name);
        if(bean != null){
            return (T) bean;
        }
        BeanDefinition beanDifinition = getBeanDefinition(name);
        return (T) createBean(name, beanDifinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws  BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;


}
