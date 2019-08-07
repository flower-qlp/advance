package com.middle.advanced.test;

import com.middle.advanced.bean.Reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 反射
 *
 * @author itoutsource.cz10
 **/
public class ReflexTest {

    public static Reflex initReflex() throws Throwable {
        //通过类装载器获取对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.middle.advanced.bean.Reflex");

        //获取默认构造器实例化对象
        Constructor cons = clazz.getDeclaredConstructor((Class[]) null);
        Reflex reflex = (Reflex) cons.newInstance();


        //通过反射方法设置值
        Method setId = clazz.getMethod("setId", Long.class);
        setId.invoke(reflex, 123L);
        return reflex;

    }


    public static void main(String[] args) {
        try {
            Reflex reflex=initReflex();
            System.out.println(reflex.getId());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
