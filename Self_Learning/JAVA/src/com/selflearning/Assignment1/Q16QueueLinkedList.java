package com.selflearning.Assignment1;

import java.util.LinkedList;
import java.util.Queue;

/* Q. 16. Implement Queue data structure using LinkedList and Queue collection.
 */
public class Q16QueueLinkedList {
	public static void main(String[] args) {
		LinkedList<String> linkedListQueue = new LinkedList<>();

		linkedListQueue.add("GK");
		linkedListQueue.add("KG");
		linkedListQueue.add("AG");

		System.out.println("LinkedList Queue: " + linkedListQueue);

		String removed = linkedListQueue.removeFirst();
		System.out.println("Removed element: " + removed);
		System.out.println("After Dequeue: " + linkedListQueue);

		System.out.println("Peek element: " + linkedListQueue.getFirst());

		Queue<String> queue = new LinkedList<>();

		queue.offer("GK");
		queue.offer("AG");
		queue.offer("KG");

		System.out.println("\nQueue Interface: " + queue);

		String polled = queue.poll();
		System.out.println("Polled element: " + polled);
		System.out.println("After Dequeue: " + queue);
		System.out.println("Peek element: " + queue.peek());
	}
}