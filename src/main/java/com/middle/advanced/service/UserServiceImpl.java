package com.middle.advanced.service;

import com.middle.advanced.bean.TUser;
import com.middle.advanced.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author itoutsource.cz10
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public TUser selectUserById(Long id) {
        return userMapper.findUserById(id);
    }
}
