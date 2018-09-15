package com.xuyifan.dspmanager.service.impl;

import com.xuyifan.dspmanager.bean.User;
import com.xuyifan.dspmanager.dao.UserMapper;
import com.xuyifan.dspmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSercviceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer insertUser(User user) {
        int i = userMapper.insert(user);
        return i;
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
