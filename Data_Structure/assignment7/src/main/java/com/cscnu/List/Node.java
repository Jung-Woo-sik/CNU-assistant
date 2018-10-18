package com.cscnu.List;

public class Node {
	public Node next = null;
	public Node prev = null;
	public Object data = null;

	Node (Object data) {
		this.data = data;
	}

	Node (Object data, Node next) {
		this.data = data;
		this.next = next;
	}

	Node (Object data, Node prev, Node next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
}

