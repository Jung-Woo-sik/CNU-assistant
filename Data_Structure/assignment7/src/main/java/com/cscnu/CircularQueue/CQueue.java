package com.cscnu.CircularQueue;

import com.cscnu.List.*;

public class CQueue implements Queue {
	private CircularDoubleLinkedList list = new CircularDoubleLinkedList ();

	public void EnqueueFront (Object data) {
		list.insertFirst(data);
	}
	public void EnqueueRear (Object data) {
		list.insertLast(data);
	}
	public Object DequeueFront() {
		Object data = list.getFirst().data;
		list.removeFirst();
		return data;
	}
	public Object DequeueRear () {
		Object data = list.getLast().data;
		list.removeLast();
		return data;
	}
	public Object getFront () {
		return list.getFirst().data;
	}
	public Object getRear () {
		return list.getLast().data;
	}
	public int size () {
		return list.getSize();
	}
	public void printAll () {
		list.printAll();
	}
}
