package com.iamvickyav.springboot.SpringBootRestWithH2.service;

import com.iamvickyav.springboot.SpringBootRestWithH2.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findUser();
}
