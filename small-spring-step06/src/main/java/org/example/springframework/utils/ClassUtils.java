package org.example.springframework.utils;

public class ClassUtils {

    public static ClassLoader getDefaultClassLoader(){
        ClassLoader cl = null;
        try{
            cl = Thread.currentThread().getContextClassLoader();
        }catch (Throwable ex){
            //cannot access thread context ClassLoader - failling back to system class loader
        }
        if(cl == null){
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }
}
