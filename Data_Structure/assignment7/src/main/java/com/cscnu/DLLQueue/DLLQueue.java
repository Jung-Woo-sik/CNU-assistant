package com.cscnu.DLLQueue;

public class DLLQueue implements Queue {
	private int size;
	private Node front, rear;

	public DLLQueue () {
		this.size = 0;
		this.front = null;
		this.rear = null;
	}

	public void EnqueueFront (Object data) {
		Node temp = new Node (data);
		if (isEmpty()) {
			front = temp;
			rear = temp;
			temp.next = null;
			temp.prev = null;
			size ++;
		} else {
			front.prev = temp;
			temp.next = front;
			temp.prev = null;
			front = temp;
			size ++;
		}
	}
	
	public void EnqueueRear (Object data) {
		Node temp = new Node (data);
		if (isEmpty()) {
			front = temp;
			rear = temp;
			temp.next = null;
			temp.prev = null;
			size ++;
		} else {
			rear.next = temp;
			temp.next = null;
			temp.prev = rear;
			rear = temp;
			size ++;
		}
	}

	public Object DequeueFront () {
		if (isEmpty()) throw new IllegalStateException("The queue is empty.");
		else {
			Object tmpData = front.data;
			if (front.next != null) {
				Node temp = front.next;
				front.next.prev = null;
				front.next = null;
				front = temp;
			} else {
				front = null;
				rear = null;
			}
			size --;
			return tmpData;
		}
	}

	public Object DequeueRear () {
		if (isEmpty()) throw new IllegalStateException("The queue is empty.");
		else {
			Object tmpData = rear.data;
			if (rear.prev != null) {
				Node temp = rear.prev;
				rear.prev.next = null;
				rear.prev = null;
				rear = temp;
			} else {
				front = null;
				rear = null;
			}
			size --;
			return tmpData;
		}
	}

	public boolean isEmpty () {
		if (size == 0) return true;
		else return false;
	}

	public Object getFront () {
		if (isEmpty()) throw new IllegalStateException("The queue is empty.");
		else return front.data;
	}
	public Object getRear () {
		if (isEmpty()) throw new IllegalStateException("The queue is empty.");
		else return rear.data;
	}
	public int size () {
		return size;
	}
	public void printAll () {
		if (isEmpty()) throw new IllegalStateException("The queue is empty.");
		else {
			Node temp = front;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}
}
