package org.example.springframework.context;

import org.example.springframework.beans.BeansException;

public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * 刷新容器
     */
    void refresh() throws BeansException;

}
