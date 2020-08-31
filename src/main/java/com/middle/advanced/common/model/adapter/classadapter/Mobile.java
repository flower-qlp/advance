package com.middle.advanced.common.model.adapter.classadapter;

public class Mobile {

    public void charging(Volteage5 voltage5) {
        if (voltage5.output5() == 5) {
            System.out.println("电压刚刚好5V，开始充电");
        } else if (voltage5.output5() > 5) {
            System.out.println("电压超过5V，都闪开 我要变成note7了");
        }
    }
}
