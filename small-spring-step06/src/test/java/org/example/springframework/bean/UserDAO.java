package org.example.springframework.bean;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("100001", "沈甄");
        hashMap.put("100002", "陆宴");
        hashMap.put("100003", "yttt");

    }
    public String queryUserName(String uId){
        return hashMap.get(uId);
    }
}
