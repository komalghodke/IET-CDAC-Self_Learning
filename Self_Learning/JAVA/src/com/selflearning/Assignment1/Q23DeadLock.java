package com.selflearning.Assignment1;

/*
 Problem Statement:
 23. Create a Deadlock class to demonstrate deadlock in multithreading environment.
*/

class SharedResource {
    String name;

    SharedResource(String name) {
        this.name = name;
    }
}

class Task1 implements Runnable {
    private SharedResource res1;
    private SharedResource res2;

    Task1(SharedResource res1, SharedResource res2) {
        this.res1 = res1;
        this.res2 = res2;
    }

    @Override
    public void run() {
        synchronized (res1) {
            System.out.println(Thread.currentThread().getName() + " locked " + res1.name);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " waiting to lock " + res2.name);
            synchronized (res2) {
                System.out.println(Thread.currentThread().getName() + " locked " + res2.name);
            }
        }
    }
}

class Task2 implements Runnable {
    private SharedResource res1;
    private SharedResource res2;

    Task2(SharedResource res1, SharedResource res2) {
        this.res1 = res1;
        this.res2 = res2;
    }

    @Override
    public void run() {
        synchronized (res2) {
            System.out.println(Thread.currentThread().getName() + " locked " + res2.name);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " waiting to lock " + res1.name);
            synchronized (res1) {
                System.out.println(Thread.currentThread().getName() + " locked " + res1.name);
            }
        }
    }
}

public class Q23DeadLock {
    public static void main(String[] args) {
        SharedResource resourceA = new SharedResource("ResourceA");
        SharedResource resourceB = new SharedResource("ResourceB");

        Thread t1 = new Thread(new Task1(resourceA, resourceB), "Thread-1");
        Thread t2 = new Thread(new Task2(resourceA, resourceB), "Thread-2");

        t1.start();
        t2.start();
    }
}

