package com.middle.advanced.controller;

import com.middle.advanced.bean.Product;
import com.middle.advanced.bean.TUser;
import com.middle.advanced.bean.TUserInfo;
import com.middle.advanced.dto.LoginDto;
import com.middle.advanced.dto.ResponseDto;
import com.middle.advanced.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Optional;

@RestController
@Api(value = "/", tags = "UserInfo")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @ApiIgnore
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

    @ApiIgnore
    @GetMapping("/user")
    public TUser userInfoById(
            @RequestParam(value = "id") Long id
    ) {
        return userService.selectUserById(id);
    }

    @ApiOperation(value = "登陆系统")
    @PostMapping(value = "/user/login")
    public ResponseDto userLogin(@RequestBody LoginDto loginDto) {
        String message = userService.login(loginDto);
        if (StringUtils.isEmpty(message)) {
            return buildSuccessResponse();
        }
        return buildResponse200(message, null);
    }

    @ApiOperation(value = "根据用户Id获取用户具体信息")
    @GetMapping(value = "/findUserInfo/{userId}")
    public ResponseDto findUserInfo(
            @ApiParam(value = "用户Id") @PathVariable(value = "userId") Long userId
    ) {
        return buildResponse10000(null, userService.findByUserId(userId));
    }

    @ApiOperation(value = "创建用户基本信息")
    @PostMapping(value = "/saveUserInfo")
    public ResponseDto saveUserInfo(
            @ApiParam(value = "用户信息") @RequestBody TUserInfo userInfo
    ) {
        userService.createUserInfo(userInfo);
        return buildSuccessResponse();
    }
}
