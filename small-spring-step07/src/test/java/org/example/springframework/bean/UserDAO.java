package org.example.springframework.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {

    private static Map<String, String> hashMap = new HashMap<>();

    public void initDataMethod(){
        System.out.println("执行：init-method");
        hashMap.put("10001", "yttt");
        hashMap.put("10002", "二狗子");
        hashMap.put("10003", "点点");
    }

    public void destroyDataMethod(){
        System.out.println("执行：destroyMethod");
        hashMap.clear();
    }
    public String queryUserName(String uId){
        return hashMap.get(uId);
    }
}
