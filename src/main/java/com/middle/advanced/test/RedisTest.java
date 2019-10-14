package com.middle.advanced.test;


import com.middle.advanced.utils.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

/**
 * @author itoutsource.cz10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisUtils redisUtils;

    @Test
    public void setVale(){
        redisUtils.set("lufei","big");
    }

    @Test
    public void setList(){
    }


}
