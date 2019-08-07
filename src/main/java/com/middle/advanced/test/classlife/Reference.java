package com.middle.advanced.test.classlife;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * 引用
 **/
public class Reference {


    public static void main(String[] args) {
        List<Integer> softList=new ArrayList<>();
        softList.add(1);
        //todo 使用list
        //.....
        //使用完
        SoftReference softReference=new SoftReference(softList);
        softList=null;

        //todo 再次使用
        if(softReference!=null){
            softList=(List<Integer>)softReference.get();
        }else{
            softList=new ArrayList<>();
        }


    }

}
