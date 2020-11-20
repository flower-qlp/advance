package com.middle.advanced.common.JVM;

import com.alibaba.fastjson.JSON;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


/**
 * @author
 */
public class ScriptSample {

    public static void main(String[] args) throws Exception {
        javaScript();
    }

    /**
     * 使用javascript计算和
     **/
    public static void javaScript() throws Exception {
        //创建脚本引擎管理器
        ScriptEngineManager manager = new ScriptEngineManager();
        //创建脚本引擎
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        //编写函数
        String text = "function sum(a,b){return a+b;}";
        //注册
        engine.eval(text);
        //调用脚本
        Invocable invocable = (Invocable) engine;
        Object result = invocable.invokeFunction("sum", 10, 1);
        System.out.println(JSON.toJSONString(result));
    }

}
