package com.cscnu.List;

public class CircularDoubleLinkedList implements DoubleLinked {
	private Node head;
	private int size;

	public CircularDoubleLinkedList () {
		this.head = new Node (null, head, head);
		this.size = 0;
	}

	public boolean insert (Object data, int position) {
		if (position < 0) throw new IllegalStateException("position can't be negative.");
		if (position > size) throw new IllegalStateException("position cant'be over size");
		if (position == 0) return insertFirst (data);
		if (position == size) return insertLast (data);
		Node tmp = getNode(position-1);
		tmp.next = new Node (data, tmp, tmp.next);
		tmp.next.next.prev = tmp.next;
		size ++;
		return true;		
	}

	public boolean insertFirst (Object data) {
		if (isEmpty()) {
			head.next = new Node (data, head, head);
			head.prev = head.next;
		} else {
			Node tmp = head.next;
			head.next = new Node (data, head, tmp);
			tmp.prev = head.next;
		}
		size ++;
		return true;
	}
	public boolean insertLast (Object data) {
		if (isEmpty()) {
			head.prev = new Node (data, head, head);
			head.next = head.prev;
		} else {
			Node tmp = head.prev;
			head.prev = new Node (data, tmp, head);
			tmp.next = head.prev;
		}
		size ++;
		return true;
	}

	public int search (Object data) {
		if (isEmpty()) return -1;
		Node tmp = head.next;
		int p = 0;
		do {
			if (tmp.data == data) return p;
			p ++;
			tmp = tmp.next;
		} while (tmp != head);
		return -1;
	}

	public boolean remove (int position) {
		if (position < 0) throw new IllegalStateException("position can't be negative.");
		if (position >= size) throw new IllegalStateException("position can't be over size.");
		if (position == 0) return removeFirst();
		if (position == size-1) return removeLast();
		Node tmp = getNode(position-1);
		tmp.next = tmp.next.next;
		tmp.next.prev = tmp;
		size --;
		return true;
	}

	public boolean removeFirst () {
		if (isEmpty()) return false;
		if (size == 1) {
			head.next = head;
			head.prev = head;
		} else {
			Node tmp = getFirst().next;
			head.next = tmp;
			tmp.prev = head;
		}
		size --;
		return true;
	}

	public boolean removeLast () {
		if (isEmpty()) return false;
		if (size == 1) {
			head.next = head;
			head.prev = head;
		} else {
			Node tmp = getLast().prev;
			tmp.next = head;
			head.prev = tmp;
		}
		size --;
		return true;
	}

	public boolean isEmpty () {
		return (size == 0);
	}
	public Node getFirst () {
		return head.next;
	}
	public Node getLast () {
		return head.prev;
	}
	public Node getNode (int position) {
		if (position < 0) throw new IllegalStateException("position can't be negative.");
		if (position >= size) throw new IllegalStateException("position cant'be over size");
		if (position < size/2) { // searching from first.
			Node tmp = head.next;
			int p = 0;
			while (p < position) {
				p ++;
				tmp = tmp.next;
			}
			return tmp;
		} else { // searching from last.
			Node tmp = head.prev;
			int p = size-1;
			while (position < p) {
				p --;
				tmp = tmp.prev;
			}
			return tmp;
		}
	}
	public int getSize () {
		return size;
	}
	public void printAll () {
		Node tmp = getFirst();
		int i = 0;
		System.out.println("%% List 출력 %% (size: " + size + ") %%");
		while(tmp != head) {
			if (tmp.prev == head)
				System.out.print("["+i+"] "+ "(prev: HEAD) ");
			else
				System.out.print("["+i+"] "+ "(prev: " + tmp.prev.data + ") ");
			if (tmp.next == head)
				System.out.println(tmp.data + " (next: HEAD)");
			else
				System.out.println(tmp.data + " (next: " + tmp.next.data + ")");
			tmp = tmp.next;
			i ++; 
		}   
		System.out.println("");
	}
}
