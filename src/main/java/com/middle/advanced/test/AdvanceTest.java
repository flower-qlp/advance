package com.middle.advanced.test;

import com.middle.advanced.common.advance.AfterGreetedAdvance;
import com.middle.advanced.common.advance.BeforeGreetedAdvance;
import com.middle.advanced.common.advance.InterceptorAdvance;
import com.middle.advanced.common.advance.ThrowAdvance;
import com.middle.advanced.service.Advance;
import com.middle.advanced.service.AdvanceImpl;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * 增强接口调试
 **/
public class AdvanceTest {

    public static void methodBefore() {
        //生成代理工厂(spring动态代理,包含jdk和cglib代理)
        ProxyFactory pf = new ProxyFactory();
        //设置代理目标
        pf.setTarget(new AdvanceImpl());
        //设置针对接口的代理,会优先选择jdkDynamicAopProxy
        //pf.setInterfaces(new AdvanceImpl().getClass().getInterfaces());
        //代理优化，优先选在cglibDynamicAopProxy
        pf.setOptimize(true);
        //添加增强方法
        pf.addAdvice(new BeforeGreetedAdvance());
        //生成代理对象
        Advance advanceObject = (Advance) pf.getProxy();
        //调用对应的方法
        advanceObject.greetedTo("fei.lu");
        advanceObject.serviceTo("jin.wang");
    }

    //对方法的代理
    public static void methodBeforeMethod() {
        //生成代理工厂(spring动态代理,包含jdk和cglib代理)
        ProxyFactory pf = new ProxyFactory();
        //设置代理目标
        pf.setTarget(new AdvanceTest());
        //添加增强方法
        pf.addAdvice(new BeforeGreetedAdvance());
        //生成代理对象
        AdvanceTest advanceObject = (AdvanceTest) pf.getProxy();
        //调用对应的方法
        advanceObject.eatWater("fei.lu");
    }

    //方法后调用
    public static void afterAdvance() {
        ProxyFactory factory = new ProxyFactory();
        factory.setOptimize(true);
        factory.setTarget(new AdvanceImpl());
        factory.addAdvice(new AfterGreetedAdvance());

        Advance advance = (Advance) factory.getProxy();
        advance.serviceTo("fei.lu");
    }

    public static void interceptor(){
        ProxyFactory factory=new ProxyFactory();
        factory.setTarget(new AdvanceImpl());
        factory.addAdvice(new InterceptorAdvance());

        Advance advance=(Advance)factory.getProxy();
        advance.serviceTo("fei.lu");
    }



    public void eatWater(String name) {
        System.out.println(name + " is eating");
    }

    public static void main(String[] args) {

    }
}
