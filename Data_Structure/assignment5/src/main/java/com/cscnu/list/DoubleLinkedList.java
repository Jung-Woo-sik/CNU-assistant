package com.cscnu.list;

public class DoubleLinkedList implements DoubleLinked {
	private Node start;
	private int size;

	public boolean insert (Object data, int position) {
		if (position == 0) {
			if (insertFirst(data)) return true;
			else return false;
		} else if (position > size || position < 0) {
			System.out.println("Cannot insert : Node [" + position + "] is pointed by null.");
			return false;
		} else {
			Node tmp = getNode(position-1);
			tmp.next.prev = new Node(data, tmp, tmp.next);
			tmp.next = tmp.next.prev;
			size ++;
			return true;
		}
	}

	public boolean insertFirst (Object data) {
		Node tmp = start;
		start = new Node(data, null, tmp);
		if (tmp != null) tmp.prev = start;
		size ++;
		return true;
	}

	public boolean insertLast (Object data) {
		if (start == null) {
			start = new Node(data);
			size ++;
			return true;
		} else {
			Node tmp = start;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = new Node (data, tmp, null);
			size ++;
			return true;
		}
	}

	public int search (Object data) {
		Node tmpNode = start;
		int position = 0;
		while (tmpNode != null) {
			if (tmpNode.data == data) return position;
			else {
				position ++;
				tmpNode = tmpNode.next;
			}
		}
		return -1; // failed to search
	}

	public boolean remove (int position) {
		if (position == 0) {
			if (removeFirst()) return true;
			else return false;
		} else if (position >= size || position < 0) {
			System.out.println("Cannot remove : Node [" + position + "] is null.");
			return false;
		} else {
			Node tmp = getNode(position-1);
			tmp.next = tmp.next.next;
			if(tmp.next != null) tmp.next.prev = tmp;
			size --;
			return true;
		}
	}

	public boolean removeFirst () {
		if (start == null) return false; // list is empty.
		start = start.next;
		if (start != null) start.prev = null;
		size --;
		return true;
	}

	public boolean removeLast () {
		if (start == null) return false; // list is empty.
		Node tmp = start;
		while (tmp.next.next != null) {
			tmp = tmp.next;
		}
		tmp.next = null;
		size --;
		return true;
	}

	public Node getFirst () {
		return start;
	}

	public Node getNode (int position) {
		if (position >= size) return null;
		else if (position < 0) return null;
		int p = 0;
		Node tmp = start;
		while (p < position) {
			p ++;
			tmp = tmp.next;
		}
		return tmp;
	}

	public int getSize () {
		return size;
	}

	public void printAll () {
		Node tmp = start;
		int i = 0;
		System.out.println("%% List 출력 %% (size: " + size + ") %%");
		while(tmp != null) {
			if (tmp.prev == null)
				System.out.print("["+i+"] "+ "(prev: null) ");
			else
				System.out.print("["+i+"] "+ "(prev: " + tmp.prev.data + ") ");
			if (tmp.next == null)
				System.out.println(tmp.data + " (next: null)");
			else
				System.out.println(tmp.data + " (next: " + tmp.next.data + ")");
			tmp = tmp.next;
			i ++;
		}
		System.out.println("");
	}
}
