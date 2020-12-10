package com.iamvickyav.springboot.SpringBootRestWithH2.service.Imp;

import com.iamvickyav.springboot.SpringBootRestWithH2.dao.UserDao;
import com.iamvickyav.springboot.SpringBootRestWithH2.pojo.User;
import com.iamvickyav.springboot.SpringBootRestWithH2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    public User findUser(){
        return userDao.findAllUser();
    }

}
