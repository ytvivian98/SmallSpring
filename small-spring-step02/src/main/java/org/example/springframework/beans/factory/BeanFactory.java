package org.example.springframework.beans.factory;

import org.example.springframework.beans.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
