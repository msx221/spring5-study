package com.msx.web.day04.pojo;

/**
 * @Author:msx
 * @Date:2020/9/24
 * @Description:com.msx.web.day04.pojo
 * @Version:1.0
 */
public class UserT {
    private String userName;
    private String sex;
    public UserT(){
        System.out.println("UserT");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void show(){
        System.out.println("show my name" + userName);
    }
}
