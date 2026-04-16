package com.selflearning.Assignment1;

/*
 Problem Statement:
 21. Assign same task and different task to multiple threads.
*/

class PrintTask implements Runnable {
	private String taskName;

	PrintTask(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println(taskName + " - iteration " + i + " executed by " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(taskName + " interrupted.");
			}
		}
	}
}

class CalculationTask implements Runnable {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 1; i <= 5; i++)
			sum += i;
		System.out.println("CalculationTask executed by " + Thread.currentThread().getName() + " → Sum = " + sum);
	}
}

class MessageTask implements Runnable {
	@Override
	public void run() {
		System.out.println("MessageTask executed by " + Thread.currentThread().getName() + " → Hello from thread!");
	}
}

public class Q21ThreadTasks {
	public static void main(String[] args) {
		PrintTask commonTask = new PrintTask("CommonTask");

		Thread t1 = new Thread(commonTask, "Thread-1");
		Thread t2 = new Thread(commonTask, "Thread-2");
		Thread t3 = new Thread(commonTask, "Thread-3");

		t1.start();
		t2.start();
		t3.start();

		Thread calcThread = new Thread(new CalculationTask(), "CalcThread");
		Thread msgThread = new Thread(new MessageTask(), "MsgThread");

		calcThread.start();
		msgThread.start();

		System.out.println("Main thread is running its own task.");
	}
}
