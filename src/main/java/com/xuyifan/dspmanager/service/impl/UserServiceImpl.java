package com.xuyifan.dspmanager.service.impl;

import com.xuyifan.dspmanager.entity.User;
import com.xuyifan.dspmanager.mapper.UserMapper;
import com.xuyifan.dspmanager.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xuyifan
 * @since 2019-08-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
