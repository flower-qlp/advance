package com.middle.advanced.service;

import com.middle.advanced.bean.TUser;
import com.middle.advanced.bean.TUserInfo;
import com.middle.advanced.dto.LoginDto;
import com.middle.advanced.mapper.UserInfoMapper;
import com.middle.advanced.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    public TUserInfo findByUserId(Long userId) {
        return userInfoMapper.findByUserId(userId);
    }

    public void createUserInfo(TUserInfo userInfo) {
        userInfoMapper.saveAndFlush(userInfo);
    }

    public List<String> userCodeFindAll() {
        return this.userFindAll().parallelStream().map(x -> x.getUserCode()).collect(Collectors.toList());
    }

    public List<TUser> userFindAll() {
        return userMapper.findAll();
    }

    public TUser selectUserById(Long id) {
        return userMapper.getOne(id);
    }

    public String login(LoginDto login) {
        TUser user = userMapper.findByUserName(login.getUserName());
        if (null == user) {
            return "当前系统不存在该账号！";
        }
        if (!user.getPassWord().equals(login.getPassWord())) {
            return "密码不正确！";
        }
        return null;
    }


}
