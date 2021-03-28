package com.wyu.model;

import java.util.Date;

public class emp {
    private int eId;
    private String ename;
    private String epassword;
    private int esex;
    private int eage;
    private String ebirthday;
    private String eaddress;
    private String ephone;
    private String esalary;
    private String email;
    private  int post;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEpassword() {
        return epassword;
    }

    public void setEpassword(String epassword) {
        this.epassword = epassword;
    }

    public int getEsex() {
        return esex;
    }

    public void setEsex(int esex) {
        this.esex = esex;
    }

    public int getEage() {
        return eage;
    }

    public void setEage(int eage) {
        this.eage = eage;
    }

    public String getEbirthday() {
        return ebirthday;
    }

    public void setEbirthday(String ebirthday) {
        this.ebirthday = ebirthday;
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

    public String getEphone() {
        return ephone;
    }

    public void setEphone(String ephone) {
        this.ephone = ephone;
    }

    public String getEsalary() {
        return esalary;
    }

    public void setEsalary(String esalary) {
        this.esalary = esalary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "emp{" +
                "eId=" + eId +
                ", ename='" + ename + '\'' +
                ", epassword='" + epassword + '\'' +
                ", esex=" + esex +
                ", eage=" + eage +
                ", ebirthday='" + ebirthday + '\'' +
                ", eaddress='" + eaddress + '\'' +
                ", ephone='" + ephone + '\'' +
                ", esalary='" + esalary + '\'' +
                ", email='" + email + '\'' +
                ", post=" + post +
                '}';
    }
}
