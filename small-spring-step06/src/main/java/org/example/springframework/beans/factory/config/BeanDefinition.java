package org.example.springframework.beans.factory.config;

import org.example.springframework.beans.PropertyValues;

public class BeanDefinition {

    //类信息
    private Class beanClass;

    //属性信息
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass){

        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClass(){
        return beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public void setBeanClass(Class beanClass){
        this.beanClass = beanClass;
    }

}
