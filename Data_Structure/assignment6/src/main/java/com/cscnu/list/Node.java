package com.cscnu.list;

public class Node {
	public Node next = null;
	public Object data = null;

	Node (Object data) {
		this.data = data;
	}

	Node (Object data, Node next) {
		this.data = data;
		this.next = next;
	}
}
