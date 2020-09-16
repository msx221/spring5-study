package com.msx.web.day02.service;

import com.msx.web.day02.dao.UserDao;
import com.msx.web.day02.dao.UserDaoImpl;
import com.msx.web.day02.dao.UserSqlDaoImpl;

/**
 * @Author:msx
 * @Date:2020/9/16
 * @Description:com.msx.web.day02.service
 * @Version:1.0
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public void getUser(){
        userDao.getUser();
    }
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
}
