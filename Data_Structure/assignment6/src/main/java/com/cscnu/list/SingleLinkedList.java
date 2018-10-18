package com.cscnu.list;

public class SingleLinkedList implements SingleLinked {
	private Node start;
	private int size;

	public boolean insert (Object data, int position) {
		if (position < 0) {
			System.out.println("Cannot insert : Node [" + position + "] can't be exist.");
			return false;
		} else if (position == 0) {
			return insertFirst (data);
		} else if (position > size) {
			System.out.println("Cannot insert : Node [" + position + "] is pointed by null.");
			return false;
		} else {
			Node tmp = getNode (position - 1);
			tmp.next = new Node (data, tmp.next);
			size ++;
			return true;
		}
	}

	public boolean insertFirst (Object data) {
		Node tmp = start;
		start = new Node(data, tmp);
		size ++;
		return true;
	}

	public boolean insertLast (Object data) {
		if (isEmpty()) return insertFirst (data);
		Node tmp = getLast ();
		tmp.next = new Node (data);
		size ++;
		return true;
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
			return removeFirst();
		} else if (position >= size || position < 0) {
			System.out.println("Cannot remove : Node [" + position + "] is null.");
			return false;
		} else {
			Node tmp = getNode(position -1);
			tmp.next = tmp.next.next;
			size --;
			return true;
		}
	}

	public boolean removeFirst () {
		if (isEmpty()) return false;
		start = start.next;
		size --;
		return true;
	}

	public boolean removeLast () {
		if (isEmpty()) return false;
		if (start.next != null) {
			Node tmp = start;
			while (tmp.next.next != null) {
				tmp = tmp.next;
			}
			tmp.next = null;
			size --;
			return true;
		} else return removeFirst();
	}

	public boolean isEmpty () {
		if (size == 0) return true;
		else return false;
	}

	public Node getFirst () {
		return start;
	}
	
	public Node getLast () {
		if (start == null) return null;
		Node tmp = start;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		return tmp;
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
		System.out.println("%% List 출력(size: "+ size + ") %%");
        while(tmp != null) {
            if(tmp.next == null)
                System.out.println("["+i+"] "+ tmp.data + "(next: null)");
            else
                System.out.println("["+i+"] "+ tmp.data + "(next: " + tmp.next.data + ")");
			tmp = tmp.next;
            i++;
        }       
        System.out.println("");
    }
}
