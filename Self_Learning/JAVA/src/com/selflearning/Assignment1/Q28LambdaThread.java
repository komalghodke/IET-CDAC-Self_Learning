package com.selflearning.Assignment1;

/*
 Problem Statement:
 28. Create multiple threads using lambda expression.
*/

public class Q28LambdaThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 3; i++) {
				System.out.println("Thread-1 (lambda) → iteration " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("Thread-1 interrupted.");
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 3; i++) {
				System.out.println("Thread-2 (lambda) → iteration " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("Thread-2 interrupted.");
				}
			}
		});

		Thread t3 = new Thread(() -> {
			for (int i = 1; i <= 3; i++) {
				System.out.println("Thread-3 (lambda) → iteration " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("Thread-3 interrupted.");
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
