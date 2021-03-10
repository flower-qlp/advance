package com.middle.advanced.common.model.proxy;

import com.middle.advanced.common.model.proxy.staticproxy.StaticProxyImpl;

public class ProxyTest {

    public static void main(String[] args) {
        StaticProxyImpl proxy=new StaticProxyImpl();
        proxy.show();
    }
}
