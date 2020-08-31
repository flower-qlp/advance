package com.middle.advanced.common.model.adapter.objectadapter;

import com.middle.advanced.common.model.adapter.classadapter.Volteage220;
import com.middle.advanced.common.model.adapter.classadapter.Volteage5;

public class VolteageAdapter2 implements Volteage5 {

    private Volteage220 volteage220;

    public VolteageAdapter2(Volteage220 volteage220) {
        this.volteage220 = volteage220;
    }


    @Override
    public int output5() {
        int original=volteage220.output220V();
        System.out.println("适配器工作开始适配电压");
        int dst = original / 44;
        System.out.println("适配完成后输出电压：" + dst);
        return dst;
    }
}
