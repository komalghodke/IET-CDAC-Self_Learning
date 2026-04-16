package com.selflearning.Assignment1;

/*
 * Q. 27. Create multiple threads using anonymous inner classes.
*/

public class Q27AnonymousThread {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Thread-1 (extends Thread) → iteration " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Thread-1 interrupted.");
                    }
                }
            }
        };

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Thread-2 (implements Runnable) → iteration " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Thread-2 interrupted.");
                    }
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Thread-3 (implements Runnable) → iteration " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("Thread-3 interrupted.");
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

        for (int i = 1; i <= 3; i++) {
            System.out.println("MainThread → iteration " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("MainThread interrupted.");
            }
        }
    }
}

