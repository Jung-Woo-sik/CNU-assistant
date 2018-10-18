package com.cscnu.List;

public class DoubleLinkedList implements DoubleLinked {
	private Node start = null;
	private Node last = null;
	private int size = 0;
	
	public boolean insert (Object data, int position) {
		if (position == 1 || size == 0) {
			insertFirst (data);
		} else if (size == position - 1) {
			insertLast (data);
		} else {
			Node pre = getNode (position-1);
			Node tmp = pre.next;
			Node newNode = new Node(data, pre, pre.next);
			pre.next = newNode;
			tmp.prev = newNode;

			size ++;
		}
		return true;
	}

	public boolean insertFirst (Object data) {
		if ( start == null) {
			last = start = new Node (data);
			size ++;
		} else {
			start = new Node (data, null, start);
			start.next.prev = start;
			size ++;
		}
		return true;
	}

	public boolean insertLast (Object data) {
		if (start == null) {
			last = start = new Node (data);
			size ++;
		} else {
			Node tmp = start;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			last = tmp.next = new Node (data);
			tmp.next.prev = tmp;
			size ++;
		}
		return true;
	}

	public int search (Object data) {
		Node node = start;

		for (int i=0; i<size; i++) {
			if (node.data.equals(data)) {
				return i;
			}
			node = node.next;
		}
		return -1;
	}

	public Node getFirst () {
		return start;
	}
	
	public Node getLast () {
		return last;
	}

	public Node getNode (int position) {
		int i;
		Node node = start;
		for (i=0; i<position-1; i++) {
			node = node.next;
		}
		return node;
	}

	public int getSize () {
		return size;
	}
}
