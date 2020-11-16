package com.middle.advanced.utils;

import com.middle.advanced.dto.LoginDto;
import org.springframework.beans.BeanUtils;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.util.HashMap;

public class test {

    public static void main(String[] args) throws Exception {
        HashMap<String,Object> hash=new HashMap<>(5);
        hash.put("yan","颜唯杰");
        hash.put("lu","鲁飞");
        StringBuffer name=new StringBuffer("dasdada");

        LoginDto loginDto=new LoginDto();

        LoginDto loginDto1=new LoginDto();
        loginDto1.setUserName(null);

        BeanUtils.copyProperties(loginDto1,loginDto);

        System.out.println("");
    }

}
