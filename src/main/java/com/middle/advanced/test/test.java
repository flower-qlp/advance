package com.middle.advanced.test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class test {
    static List<String> arrayList = new ArrayList<>();

    List<String> copyList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        new threadTwo().run();
        new threadOne().run();
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
