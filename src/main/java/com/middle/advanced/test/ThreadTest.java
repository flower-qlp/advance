package com.middle.advanced.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest {

    public static int num = 0;

    public static volatile int volatileNum = 0;

    public static void main(String[] args) throws InterruptedException {

        volatileTest();
    }

    public static void volatileTest() {
        for (int i = 0; i < 100; i++) {
            MyThread thread = new MyThread();
            Thread th = new Thread(thread);
            th.start();
        }

    }

    static class MyThread implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread() + "--num1-->" + num);
            num++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + "--num2-->" + num);
            System.out.println(Thread.currentThread() + "--volatileNum1-->" + volatileNum);
            volatileNum++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + "--volatileNum2-->" + volatileNum);
        }
    }


    public static void CallableTest() {
        Callable<Integer> myCallable = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<Integer>(myCallable);

        for (int i = 0; i < 100; i++) {
            System.out.println("循环 " + Thread.currentThread().getName() + " " + i);
            Thread thread = new Thread(ft);
            thread.setName("线程名称" + i);
            thread.start();
            System.out.println("Tread name:" + thread.getName());
        }

        System.out.println("主线程for循环执行完毕..");

        //取得新创建的新线程中的call()方法返回的结果
        try {
            int sum = ft.get();
            System.out.println("sum = " + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }


    static class MyCallable implements Callable<Integer> {

        private int i = 0;

        @Override
        public Integer call() throws Exception {
            int sum = 0;
            for (; i < 100; i++) {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " " + i);
                sum += i;
            }
            return sum;
        }
    }
}
