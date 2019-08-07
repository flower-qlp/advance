package com.middle.advanced.common.JVM;

import com.alibaba.fastjson.JSON;
import com.middle.advanced.bean.Product;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * 需要添加依赖
 * SpEl表达式
 **/
public class SpEL {

    public static void main(String[] args) {
        new SpEL().sayHello();
        new SpEL().easySpEL();

    }

    public void sayHello() {
        /**
         * '标识为String类型,没有会报错
         * **/
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("'Hello' +' World!'");
        String message = (String) expression.getValue();
        System.out.println(message);
    }

    public void easySpEL() {
        Product product = new Product();
        product.setName("这是一个无用的product!");

        StandardEvaluationContext context = new StandardEvaluationContext(product);
        new SpelExpressionParser().parseExpression("name").setValue(context, "也不知道啥名字");
        Product product1 = (Product) context.getRootObject().getValue();
        System.out.println(product1.getName());
    }
}
