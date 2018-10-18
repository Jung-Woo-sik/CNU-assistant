package com.cscnu.Queue;

public class SampleArrayQueue {
	public static void main (String[] args) {
		System.out.println(" ---- ArrayQueue printing ----");
		ArrayQueue queue = new ArrayQueue ();

		queue.Enqueue("Computer Science Engineering");
		queue.Enqueue("2017");
		queue.Enqueue("Spring");
		queue.Enqueue("Data Structure");
		queue.Enqueue("Example");

		System.out.println("Queue first object : " + queue.getFront());

		System.out.println(queue.Dequeue() + "(size : " + queue.size() + ")");
		System.out.println(queue.Dequeue() + "(size : " + queue.size() + ")");
		System.out.println(queue.Dequeue() + "(size : " + queue.size() + ")");
		System.out.println(queue.Dequeue() + "(size : " + queue.size() + ")");

		queue.Enqueue("Next Tuesday");
		queue.Enqueue("10:00");
		queue.Enqueue("midterm exam");

		System.out.println(queue.Dequeue() + "(size : " + queue.size() + ")");
		System.out.println(queue.Dequeue() + "(size : " + queue.size() + ")");
		System.out.println(queue.Dequeue() + "(size : " + queue.size() + ")");
		System.out.println(queue.Dequeue() + "(size : " + queue.size() + ")");
	}
}
