package com.xuyifan.dspmanager.service;

import com.xuyifan.dspmanager.bean.User;

import java.util.List;

public interface UserService {
    Integer insertUser(User user);
    List<User> getUserList();
}
