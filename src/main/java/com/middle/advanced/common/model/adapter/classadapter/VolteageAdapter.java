package com.middle.advanced.common.model.adapter.classadapter;

public class VolteageAdapter extends Volteage220 implements Volteage5 {
    @Override
    public int output5() {
        int original=output220V();
        System.out.println("适配器工作开始适配电压");
        int dst = original / 44;
        System.out.println("适配完成后输出电压：" + dst);
        return dst;
    }
}
