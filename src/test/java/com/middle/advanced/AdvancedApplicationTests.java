package com.middle.advanced;

import com.alibaba.fastjson.JSON;
import com.middle.advanced.utils.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdvancedApplicationTests {

    @Autowired
    private RedisUtils redisUtils;

    @Test
    public void contextLoads() {

//        Map<String, Object> map = new HashMap<>();
//        map.put("wc", "cc");
//        map.put("cc", "龙岗");
//        map.put("cd", "yellow");
//        redisUtils.setMany(map);

//        String userName = String.valueOf(redisUtils.get("school"));
//        System.out.println(userName);

//        List<String> keys = new ArrayList<>();
//        keys.add("wc");
//        keys.add("cc");
//        System.out.println(JSON.toJSONString(redisUtils.getMulti(keys)));

        redisUtils.hashSet("userInfo:320911199011255689", "userName", "YWJ");
        redisUtils.hashSet("userInfo:320911199011255689", "age", 20);
        System.out.println(JSON.toJSONString(redisUtils.hget("userInfo:320911199011255689", "userName")));


        Map m=new LinkedHashMap();

    }

}
