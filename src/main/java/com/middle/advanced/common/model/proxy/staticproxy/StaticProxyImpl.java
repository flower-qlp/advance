package com.middle.advanced.common.model.proxy.staticproxy;

public class StaticProxyImpl implements BaseSubject {

    private BaseSubjectImpl baseSubject=new BaseSubjectImpl();

    @Override
    public void show() {
        showProxy();
        baseSubject.show();
        showProxy();
    }

    void showProxy() {
        System.out.println("代理显示");
    }
}
