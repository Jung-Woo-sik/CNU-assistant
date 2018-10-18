package com.cscnu.stack;

import com.cscnu.list.*;

public class ListStack implements Stack {
	private SingleLinkedList list = new SingleLinkedList ();

	public Object peek () {
		if (isEmpty()) throw new IllegalStateException("stack is empty.");
		return list.getLast().data;
	}

	public Object pop () {
		if (isEmpty()) throw new IllegalStateException("stack is empty.");
		Object item = list.getLast().data;
		list.removeLast();
		return item;
	}
	
	public void push (Object object) {
		list.insertLast (object);
		return;
	}

	public int size () {
		return list.getSize();
	}
	
	public boolean isEmpty () {
		return list.isEmpty();
	}
}
