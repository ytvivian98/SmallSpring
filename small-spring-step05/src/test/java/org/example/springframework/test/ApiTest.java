package org.example.springframework.test;

import cn.hutool.core.io.IoUtil;
import org.example.springframework.bean.UserDAO;
import org.example.springframework.bean.UserService;
import org.example.springframework.beans.PropertyValue;
import org.example.springframework.beans.PropertyValues;
import org.example.springframework.beans.factory.config.BeanDefinition;
import org.example.springframework.beans.factory.config.BeanReference;
import org.example.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.example.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.example.springframework.core.io.DefaultResourceLoader;
import org.example.springframework.core.io.Resource;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class ApiTest {

    private DefaultResourceLoader resourceLoader;

    @BeforeEach
    public void init(){
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void test_classpath() throws IOException{
        Resource resource = resourceLoader.getResource("classpath:important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_file() throws IOException{
        Resource resource = resourceLoader.getResource("src/test/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String s = IoUtil.readUtf8(inputStream);
        System.out.println(s);
    }

    @Test
    public void test_url() throws IOException{
        Resource resource = resourceLoader.getResource("https://github.com/ytvivian98/SmallSpring/blob/master/small-spring-step05/src/test/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_xml(){
        //初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //读取配置文件 注册bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        //获取bean对象调用方法
        UserService userService = (UserService) beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("result = " + result);
    }

    @Test
    public void test_BeanFactory(){

        //初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //UserDao注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDAO.class));

        //UserService设置属性(uId, userDAO)
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "100001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        //注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }


}
