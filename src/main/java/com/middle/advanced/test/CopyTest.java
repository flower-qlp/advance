package com.middle.advanced.test;


import com.alibaba.fastjson.JSON;
import com.middle.advanced.common.model.clone.OriginClass;
import com.middle.advanced.dto.copy.TargetClass;
import org.springframework.beans.BeanUtils;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.util.StopWatch;

import java.util.Arrays;

/**
 * @author copy字段的几种方法的性能比较
 * springframework的BeanUtils
 * cglib的BeanCopier
 * Apache BeanUtils包的PropertyUtils类
 **/
public class CopyTest {
    public static void cgLibBeanCopy(OriginClass originClass, int length) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        TargetClass targetClass = new TargetClass();
        for (int i = 0; i < length; i++) {
            BeanCopier copier = BeanCopier.create(OriginClass.class, TargetClass.class, false);
            copier.copy(originClass, targetClass, null);
        }
        stopwatch.stop();
        System.out.println("总共耗时: " + stopwatch.getTotalTimeMillis());
    }

    public static void springFrameBeanCopy(OriginClass originClass, int length) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        TargetClass targetClass = new TargetClass();
        for (int i = 0; i < length; i++) {
            BeanUtils.copyProperties(originClass,targetClass);
        }
        stopwatch.stop();
        System.out.println("总共耗时: " + stopwatch.getTotalTimeMillis());
    }

    public static void main(String[] args) {




//        Object[] snsOriginal = new Object[1050];
//        for (int i = 0; i < 1050; i++) {
//            snsOriginal[i] = i;
//        }
//        int arrLength = snsOriginal.length;
//        if (0 == arrLength) {
//            return;
//        }
//        int rounds = arrLength / 100 + (arrLength % 100 != 0 ? 1 : 0);
//        Object[] sns = new Object[99];
//        int end = 0;
//        for (int i = 0; i < rounds; i++) {
//            if (i == (rounds - 1)) {
//                end = arrLength;
//            } else {
//                end = 100 * i + 100;
//            }
//            System.out.println("start-->" + 100 * i + "end-->" + end);
//            sns = Arrays.copyOfRange(snsOriginal, 100 * i, end);
//            System.out.println(JSON.toJSONString(sns));
//        }
    }

}
