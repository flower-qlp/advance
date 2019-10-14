package com.middle.advanced.test;

import com.alibaba.fastjson.JSON;
import com.middle.advanced.bean.CloneClass;
import com.middle.advanced.bean.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author itoutsource.cz10
 * test with class clone
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CloneTest {

    @Test
    public void copyObject() throws Exception {
        Product product = new Product(1L, "被复制的产品");

        Product product1 = CloneClass.clone(product);
        product1.setName("复制完成产品！");
        System.out.println(JSON.toJSONString(product1));
    }
}
