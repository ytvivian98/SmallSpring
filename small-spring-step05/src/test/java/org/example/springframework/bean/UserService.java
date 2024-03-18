package org.example.springframework.bean;

public class UserService {
    private String uId;

    private UserDAO userDao;

    public UserService() {
    }

    public String queryUserInfo(){

        return userDao.queryUserName(uId);
    }

    public void setUserDao(UserDAO userDao) {
        this.userDao = userDao;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(uId);
        return sb.toString();
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDAO getUserDao() {
        return userDao;
    }


}
