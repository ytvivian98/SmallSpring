package org.example.springframework.beans.factory.config;

import org.example.springframework.beans.BeansException;
import org.example.springframework.beans.factory.BeanFactory;

public interface AutowiredCapableBeanFactory extends BeanFactory {
    /**
     * 执行BeanPostProcessors 接口实现类的 postProcessBeforeInitialization方法
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行BeanPostProcessors 接口实现类的postProcessBeforeInitialization 方法
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;
}
