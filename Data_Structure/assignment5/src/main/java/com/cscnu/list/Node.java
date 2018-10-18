package com.cscnu.list;

public class Node {
	public Object data = null;
	public Node prev = null;
	public Node next = null;

	Node (Object data) {
		this.data = data;
	}
	Node(Object data, Node next) {
		this.data = data;
		this.next = next;
	}
	Node(Object data, Node prev, Node next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
}
