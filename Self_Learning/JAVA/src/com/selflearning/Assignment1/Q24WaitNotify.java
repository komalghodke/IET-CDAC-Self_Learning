package com.selflearning.Assignment1;

/*
 Problem Statement:
 24. Implement wait, notify, notifyAll methods.
*/

class SharedResources {
    private boolean available = false;

    public synchronized void produce() {
        System.out.println(Thread.currentThread().getName() + " producing...");
        available = true;
        notify();
        notifyAll();
    }

    public synchronized void consume() {
        while (!available) {
            try {
                System.out.println(Thread.currentThread().getName() + " waiting...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " consumed.");
        available = false;
    }
}

class Producer extends Thread {
    private SharedResources resource;

    Producer(SharedResources resource, String name) {
        super(name);
        this.resource = resource;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resource.produce();
    }
}

class Consumer extends Thread {
    private SharedResources resource;

    Consumer(SharedResources resource, String name) {
        super(name);
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.consume();
    }
}

public class Q24WaitNotify {
    public static void main(String[] args) {
    	SharedResources resource = new SharedResources();

        Consumer c1 = new Consumer(resource, "Consumer-1");
        Consumer c2 = new Consumer(resource, "Consumer-2");
        Consumer c3 = new Consumer(resource, "Consumer-3");

        Producer p1 = new Producer(resource, "Producer-1");

        c1.start();
        c2.start();
        c3.start();

        p1.start();
    }
}

