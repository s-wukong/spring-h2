package com.iamvickyav.springboot.SpringBootRestWithH2.dao;

import com.iamvickyav.springboot.SpringBootRestWithH2.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    @Select("select * from app_user")
    User findAllUser();
}
