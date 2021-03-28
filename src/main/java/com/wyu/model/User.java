package com.wyu.model;


//user实体类
public class User {
    private int id ;
    private String uId;
    private String userName;
    private String password;
    private String uName;
    private Integer sex;
    private  Integer age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uId;
    }

    public void setUid(String uId) {
        this.uId = uId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uid='" + uId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", uName='" + uName + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
