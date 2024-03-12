package org.example.springframework.bean;

public class UserService {
    private String uId;

    private UserDAO userDao;

    public UserService() {
    }

    public UserService(String uId) {
        this.uId = uId;
    }

    public void queryUserInfo(){
        System.out.println("查询用户信息：" + userDao.queryUserName(uId));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(uId);
        return sb.toString();
    }
}
