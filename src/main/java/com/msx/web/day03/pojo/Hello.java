package com.msx.web.day03.pojo;

/**
 * @Author:msx
 * @Date:2020/9/18
 * @Description:com.msx.web.day03.pojo
 * @Version:1.0
 */
public class Hello {
    private String str;

    public void setStr(String str){
        this.str = str;
    }

    public String getStr(){
        return this.str;
    }

    public String toString(){
        return "Hello "+ str;
    }

}
