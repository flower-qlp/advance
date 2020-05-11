package com.middle.advanced.test;

import com.middle.advanced.bean.Product;
import com.middle.advanced.bean.Reflex;
import com.middle.advanced.service.aspect.NaiveWater;
import com.middle.advanced.utils.annotation.NeedTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
        //创建一个对象
        Reflex reflex = (Reflex) cons.newInstance();


        //通过反射方法设置值
        Method setId = clazz.getMethod("setId", Long.class);
        setId.invoke(reflex, 123L);
        return reflex;

    }


    public static void main(String[] args) {
//        try {
//            Reflex reflex = initReflex();
//            System.out.println(reflex.getId());
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
        try {
            new ReflexTest().getValueFromAnnotation();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    private void reflexGetClass(Product product) {
        //一个类在JVM中只会存在一个Class实例,
        // 即以下三种获取的class，使用equals得到的都是true

        //对于未知Object，可以直接调用方法一
        Class c1 = product.getClass();

        //方法二 类名.class获得。该方法最安全，性能更好
        Class c2 = Product.class;

        //利用Class的forName获取,用的最多,会抛出异常
        try {
            Class c3 = Class.forName("com.middle.advanced.bean.Product");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    private void createObject() throws IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class clazz = Product.class;
        //调用无参构造函数
        Product product = (Product) clazz.newInstance();

        //通过构造器
        Constructor<Product> productConstructor = clazz.getConstructor();
        //调用有参构造函数
        productConstructor.newInstance("");

        //获取私有方法
        //获取含有String,int 参数的构造方法
        Constructor con = clazz.getDeclaredConstructor(new Class[]{String.class});
        //设置权限，可以直接访问private的方法
        con.setAccessible(true);
        Object out = con.newInstance("神奇宝贝");

    }

    /**
     * 获取注解中的字段
     **/
    public void getValueFromAnnotation() throws NoSuchMethodException {
        Method method = NaiveWater.class.getMethod("greetedTo",String.class);
        NeedTest need = method.getAnnotation(NeedTest.class);
        System.out.println(need.value());
    }

}
