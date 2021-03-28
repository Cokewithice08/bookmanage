package com.wyu.model;

public class Placard {
    private int pId;
    private String pTitle;
    private String pMessage;
    private String issueTime;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpTitle() {
        return pTitle;
    }

    public void setpTitle(String pTitle) {
        this.pTitle = pTitle;
    }

    public String getpMessage() {
        return pMessage;
    }

    public void setpMessage(String pMessage) {
        this.pMessage = pMessage;
    }

    public String getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(String issueTime) {
        this.issueTime = issueTime;
    }

    @Override
    public String toString() {
        return "Placard{" +
                "pId=" + pId +
                ", pTitle='" + pTitle + '\'' +
                ", pMessage='" + pMessage + '\'' +
                ", issueTime='" + issueTime + '\'' +
                '}';
    }
}
