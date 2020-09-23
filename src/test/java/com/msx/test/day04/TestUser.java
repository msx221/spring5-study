package com.msx.test.day04;

import com.msx.web.day04.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:msx
 * @Date:2020/9/24
 * @Description:com.msx.test.day04
 * @Version:1.0
 */
public class TestUser {
    @Test
    public void myTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/day04/beans.xml");
        User user = (User)context.getBean("user");
        User user2 = (User)context.getBean("user");
        System.out.println(user == user2); //true
    }
}
