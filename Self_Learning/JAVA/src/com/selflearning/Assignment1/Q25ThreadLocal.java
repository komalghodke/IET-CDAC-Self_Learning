package com.selflearning.Assignment1;

/*
 Problem Statement:
 25. Demonstrate how to share threadlocal data between multiple threads.
*/

class MyTask implements Runnable {
    private static ThreadLocal<String> threadLocalData = new ThreadLocal<>();

    private String value;

    MyTask(String value) {
        this.value = value;
    }

    @Override
    public void run() {
        threadLocalData.set(value);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() +
                " → ThreadLocal value: " + threadLocalData.get());
    }
}

public class Q25ThreadLocal {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask("Data for Thread-1"), "Thread-1");
        Thread t2 = new Thread(new MyTask("Data for Thread-2"), "Thread-2");
        Thread t3 = new Thread(new MyTask("Data for Thread-3"), "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
