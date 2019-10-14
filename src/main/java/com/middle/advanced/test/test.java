package com.middle.advanced.test;


import com.middle.advanced.bean.Product;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class test {
    static List<String> arrayList = new ArrayList<>();

    List<String> copyList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
//        new threadTwo().run();
//        new threadOne().run();

        Map<String,String> parentMap=new HashMap<>();
        parentMap.put("key1","value1");
        parentMap.put("key2","values2");
        Set<Map.Entry<String,String>> entries=parentMap.entrySet();
        Iterator<Map.Entry<String,String>> iterators=entries.iterator();
        while(iterators.hasNext()){
            Map.Entry<String,String> object=iterators.next();
            String key=object.getKey();
            String value=object.getValue();
            System.out.println(key+value);
        }


    }



    private static class threadOne extends Thread {
        @Override
        public void run() {
            int i = 0;
            while (i < 6) {
                arrayList.add("test-one " + i);
                printAll();
                i++;
            }
        }
    }

    private  static class threadTwo extends Thread{
        @Override
        public void run() {
            int i = 0;
            while (i < 10) {
                arrayList.add("test-two " + i);
                printAll();
                i++;
            }
        }
    }

    private static void printAll(){
        System.out.println("------------------------------");
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println("value="+(String)iterator.next());
        }
    }
}
