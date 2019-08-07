package com.middle.advanced.test;

/**
 * threadLoad 保存线程中的变量
 * 每个线程单独自己的变量,无法错作其他线程中的变量
 *
 * @author itoutsource.cz10
 */
public class ThreadLoadTest {

    private static final ThreadLocal<Object> threadLocal = new ThreadLocal<Object>() {
        @Override
        protected Object initialValue() {

            System.out.println(Thread.currentThread().getName() + " 调用get方法时，当前线程共享变量没有设置，调用initialValue获取默认值！");
            return null;
        }
    };

    public static class MyTask1 implements Runnable {

        private String name;

        public MyTask1(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                if (null == ThreadLoadTest.threadLocal.get()) {
                    ThreadLoadTest.threadLocal.set(0);
                    System.out.println("线程" + name + ": 0");
                } else {
                    int num = (int) ThreadLoadTest.threadLocal.get();
                    ThreadLoadTest.threadLocal.set(num + 1);
                    System.out.println("线程" + name + ": " + ThreadLoadTest.threadLocal.get());
                    if (i == 3) {
                        ThreadLoadTest.threadLocal.remove();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }


    public static class MyTask2 implements Runnable {

        private String name;

        public MyTask2(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                if (null == ThreadLoadTest.threadLocal.get()) {
                    ThreadLoadTest.threadLocal.set("a");
                    System.out.println("线程" + name + ": a");
                } else {
                    String str = (String) ThreadLoadTest.threadLocal.get();
                    ThreadLoadTest.threadLocal.set(str + "b");
                    System.out.println("线程" + name + ": " + ThreadLoadTest.threadLocal.get());
                    if (i == 3) {
                        ThreadLoadTest.threadLocal.remove();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) {
        new Thread(new MyTask1("Integer1")).start();
        new Thread(new MyTask2("String1")).start();
        new Thread(new MyTask1("Integer2")).start();
        new Thread(new MyTask2("String2")).start();
    }
}
