package org.example.springframework.bean;

public class UserService {
    private String uId;
    private String company;
    private String location;
    private UserDAO userDao;

    public UserService() {
    }

    public String queryUserInfo(){

        return userDao.queryUserName(uId) + "," + company + "," + location;
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


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
