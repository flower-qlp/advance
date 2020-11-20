package com.middle.advanced.service.aspect;

import com.middle.advanced.utils.annotation.NeedTest;

/**
 * @author
 * 关于AOP切面 注解的新增与使用
 */
public class ForumService {

    @NeedTest(value = true)
    public void delete(int id){
        System.out.println("删除---"+id);
    }

    @NeedTest
    public void update(int id){
        System.out.println("跟新---"+id);
    }
}
