package com.msx.test.day02;

import com.msx.web.day02.dao.UserDaoImpl;
import com.msx.web.day02.dao.UserSqlDaoImpl;
import com.msx.web.day02.service.UserService;
import com.msx.web.day02.service.UserServiceImpl;
import org.junit.Test;

/**
 * @Author:msx
 * @Date:2020/9/17
 * @Description:com.msx.test.day02
 * @Version:1.0
 */
public class testDao {
    private UserService userService = new UserServiceImpl();
    @Test
    public void getUser(){
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();
    }
}
