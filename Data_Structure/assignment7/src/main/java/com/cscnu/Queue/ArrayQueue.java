package com.cscnu.Queue;

public class ArrayQueue implements Queue {
	private static final int MAXQUEUE = 1000;
	private Object[] obj = new Object[MAXQUEUE];
	private int size = 0;
	private int front = 0, rear = 0;

	public void Enqueue (Object object) {
		if (size >= MAXQUEUE) {
			System.out.println("The queue is full.");
		} else {
			obj[rear] = object;
			rear ++;
			size ++;
		}
	}
	public Object getFront () {
		if (size == 0) {
			throw new IllegalStateException("The queue is empty.");
		} else {
			return obj[front];
		}
	}
	public Object Dequeue() {
		if (size == 0) {
			throw new IllegalStateException ("The queue is empty.");
		} else {
			Object temp = obj[front];
			size --;
			System.arraycopy(obj, 1, obj, 0, size);
			rear --;
			return temp;
		}
	}
	public int size () {
		return size;
	}
}
