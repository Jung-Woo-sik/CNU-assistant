package com.cscnu.DLLQueue;

public class SampleDLLQueue {
	public static void main (String[] args) {
		DLLQueue q = new DLLQueue();
	
		System.out.println ("EnqueueFront 3, 2, 1 in order.");
		q.EnqueueFront("3");
		q.EnqueueFront("2");
		q.EnqueueFront("1");
		System.out.println("q.getFront : " + q.getFront());
		System.out.println("q.getRear : " + q.getRear());

		System.out.println ("DequeueFront 3 times.");
		System.out.println(q.DequeueFront() + "(size " + q.size() + ")");
		System.out.println(q.DequeueFront() + "(size " + q.size() + ")");
		System.out.println(q.DequeueFront() + "(size " + q.size() + ")");

		System.out.println ("EnqueueRear 3, 2, 1 in order.");
		q.EnqueueRear("3");
		q.EnqueueRear("2");
		q.EnqueueRear("1");
		System.out.println("q.getFront : " + q.getFront());
		System.out.println("q.getRear : " + q.getRear());

		System.out.println ("DequeueRear 3 times.");
		System.out.println(q.DequeueRear() + "(size " + q.size() + ")");
		System.out.println(q.DequeueRear() + "(size " + q.size() + ")");
		System.out.println(q.DequeueRear() + "(size " + q.size() + ")");
	}
}
