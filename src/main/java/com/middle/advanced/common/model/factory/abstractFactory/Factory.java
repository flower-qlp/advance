package com.middle.advanced.common.model.factory.abstractFactory;

public interface Factory {

    Object createBaseInfo(ApplyReq req);

    Product createProduct(ApplyReq req);

    Object createUser(ApplyReq req);

}
