package com.middle.advanced.common.model.template.test;

public abstract class AbstractClass {

    public void TemplateMethod() {
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    public void SpecificMethod() {
        System.out.println("开始模板方法");
    }

    public abstract void abstractMethod1();

    public abstract void abstractMethod2();

}
