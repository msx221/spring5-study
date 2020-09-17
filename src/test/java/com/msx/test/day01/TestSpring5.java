package com.msx.test.day01;

import com.msx.web.day01.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:msx
 * @Date:2020/9/16
 * @Description:com.msx.test
 * @Version:1.0
 */
public class TestSpring5 {
    @Test
    public void testAdd(){
        //1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("/day01/bean1.xml");
        //2 获取配置的对象
        User user = context.getBean("user",User.class);
        System.out.println(user);
        user.add();
    }
}
