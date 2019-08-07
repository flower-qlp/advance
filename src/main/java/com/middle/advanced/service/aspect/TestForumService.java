package com.middle.advanced.service.aspect;

import com.middle.advanced.utils.annotation.NeedTest;

import java.lang.reflect.Method;

public class TestForumService {


    public void test() {
        //得到class对象
        Class clazz = ForumService.class;
        //得到对应的方法数组
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            //获取方法上的注解对象
            NeedTest nt = method.getAnnotation(NeedTest.class);
            if (nt != null) {
                if (nt.value()) {
                    System.out.println(method.getName() + "需要测试");
                } else {
                    System.out.println(method.getName() + "不需要测试");

                }
            }
        }
    }

    public static void main(String[] args) {
        new TestForumService().test();
    }

}
