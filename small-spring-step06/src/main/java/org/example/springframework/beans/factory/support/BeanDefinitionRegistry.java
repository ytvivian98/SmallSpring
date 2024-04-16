package org.example.springframework.beans.factory.support;

import org.example.springframework.beans.BeansException;
import org.example.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    /**
     * 像注册表中注册BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 使用bean名称查询BeanDefinition
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 判断是否包含指定名称的BeanDefinition
     *
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 返回注册表中所有的bean名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
