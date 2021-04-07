package com.middle.advanced.common.model.mediator.test;

public class test {
    public static void main(String[] args) {
        Middum md = new EstateMedium();
        Customer member1, member2;
        member1 = new Seller("张三(卖方)");
        member2 = new Buyer("李四(买方)");
        md.register(member1);
        md.register(member2);
    }
}
