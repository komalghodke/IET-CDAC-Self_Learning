package com.selflearning.Assignment1;

/*
 Problem Statement:
 20. Create multiple threads using Thread class and Runnable interfaces.
*/
class MyThread extends Thread {
	private String taskName;

	MyThread(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(taskName + " - iteration " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(taskName + " interrupted.");
			}
		}
	}
}

class MyRunnable implements Runnable {
	private String taskName;

	MyRunnable(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(taskName + " - iteration " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(taskName + " interrupted.");
			}
		}
	}
}

public class Q20MultipleThreads {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("ThreadClass-1");
		MyThread t2 = new MyThread("ThreadClass-2");

		Thread r1 = new Thread(new MyRunnable("Runnable-1"));
		Thread r2 = new Thread(new MyRunnable("Runnable-2"));

		t1.start();
		t2.start();
		r1.start();
		r2.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("MainThread - iteration " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("MainThread interrupted.");
			}
		}
	}
}
