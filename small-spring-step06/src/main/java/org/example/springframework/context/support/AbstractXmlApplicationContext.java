package org.example.springframework.context.support;

import org.example.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.example.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * 上下文中对配置信息的加载
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext{
    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if(null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
