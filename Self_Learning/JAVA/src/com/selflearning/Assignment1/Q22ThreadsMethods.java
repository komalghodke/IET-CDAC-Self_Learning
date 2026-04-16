package com.selflearning.Assignment1;

/*
 Problem Statement:
 22. Understand sleep, join, yield methods.
*/

class MyThreads extends Thread {
	public MyThreads(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + " - iteration " + i);

			Thread.yield();

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + " interrupted.");
			}
		}
	}
}

public class Q22ThreadsMethods {
	public static void main(String[] args) {
		MyThreads t1 = new MyThreads("Thread-1");
		MyThreads t2 = new MyThreads("Thread-2");

		t1.start();
		t2.start();

		try {
			t1.join();
			System.out.println("Main thread waited for Thread-1 to finish.");
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted while waiting.");
		}

		System.out.println("Main thread continues after join.");
	}
}
