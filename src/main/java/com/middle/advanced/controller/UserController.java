package com.middle.advanced.controller;

import com.middle.advanced.bean.Product;
import com.middle.advanced.bean.TUser;
import com.middle.advanced.mapper.UserMapper;
import com.middle.advanced.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{userName}")
    public String userInfo(@PathVariable("userName") Optional<String> userName,
                           @RequestParam("value") Optional<Integer> value) {
        //对象为空的情况
        Product p1 = null;
        Product p2 = new Product(1L, "鲁飞");
        Optional.ofNullable(p1).isPresent();

        Product result = Optional.ofNullable(p1).orElse(p2);

        return userName.get();
    }

    @GetMapping("/user")
    public TUser userInfoById(@RequestParam(value = "id") Long id
    ) {
        return userService.selectUserById(id);
    }

}
