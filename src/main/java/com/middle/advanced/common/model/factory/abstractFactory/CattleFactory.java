package com.middle.advanced.common.model.factory.abstractFactory;

public class CattleFactory implements Factory {
    private CattleBaseInfo info;
    private Product product;
    private CattleUser cattleUser;

    @Override
    public Object createBaseInfo(ApplyReq req) {
        CattleBaseInfo cattleBaseInfo =
                (CattleBaseInfo) new CattleBaseInfo().init();
        this.info = cattleBaseInfo;
        return this.info;
    }

    @Override
    public Product createProduct(ApplyReq req) {
        this.product = new Product();
        return this.product;
    }

    @Override
    public Object createUser(ApplyReq req) {
        this.cattleUser = new CattleUser();
        return cattleUser;
    }

}
