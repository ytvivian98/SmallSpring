package org.example.springframework.beans.factory;

import org.example.springframework.beans.BeansException;
import org.example.springframework.beans.factory.config.AutowiredCapableBeanFactory;
import org.example.springframework.beans.factory.config.BeanDefinition;
import org.example.springframework.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowiredCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

}
