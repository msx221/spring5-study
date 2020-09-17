package com.msx.test.day03;

import com.msx.web.day03.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:msx
 * @Date:2020/9/18
 * @Description:com.msx.test.day03
 * @Version:1.0
 */
public class MyTest {
    /*@Test
    public void MyTest(){
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("day03/beans.xml");
        //我们的对象都在Spring中管理，我们要使用，直接去里面取出来就可以了
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }  */
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("/day03/beans.xml");
        Hello hello = (Hello)context.getBean("hello");
        System.out.println(hello.toString());
    }
}
