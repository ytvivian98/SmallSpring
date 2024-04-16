package org.example.springframework.beans.factory;

public interface InitializingBean {

    /**
     * bean处理属性填充后调用
     */
    void afterPropertiesSet() throws Exception;

}
