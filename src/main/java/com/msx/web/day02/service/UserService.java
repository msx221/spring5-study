package com.msx.web.day02.service;

import com.msx.web.day02.dao.UserDao;

/**
 * @Author:msx
 * @Date:2020/9/16
 * @Description:com.msx.web.day02.service
 * @Version:1.0
 */
public interface UserService {
    void getUser();
    void setUserDao(UserDao userDao);
}
