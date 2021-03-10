package com.middle.advanced.common.model.adapter.test;

import java.util.Arrays;
import java.util.List;

//对外暴露接口
public class ABCServiceImpl extends Adapt implements ABCService {
    @Override
    public void create() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        createOut(list.toString());
    }

    @Override
    public void send() {
        System.out.println("send=====>");
    }

    @Override
    public void end() {
        System.out.println("send=====>");
    }
}
