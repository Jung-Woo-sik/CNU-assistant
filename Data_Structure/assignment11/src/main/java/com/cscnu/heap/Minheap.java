package com.cscnu.heap;

import java.util.LinkedList;

public class Minheap {
	private LinkedList<Integer> list;

	public Minheap () {
		list = new LinkedList<Integer>();
	}

	public boolean insert (Integer key) {
		int pointer = list.size();
		list.addLast (key);

		while (pointer > 0 && list.get(pointer) < list.get((pointer - 1) / 2)) {
			Integer temp = list.get(pointer);
			list.set(pointer, list.get((pointer-1)/2));
			list.set((pointer-1)/2, temp);
			pointer = (pointer - 1) / 2;
		}
		return true;
	}

	public boolean delete (Integer key) {
		if (! list.contains(key)) return false;
		int target = list.indexOf(key);
		list.set(target, list.getLast());
		list.removeLast();
		fixHeap (target);
		return true;
	}

	public void fixHeap (int root) {
		int pointer = root;
		while (pointer * 2 + 1 < list.size()) {
			Integer leftChild, rightChild;
			Integer parent = list.get(pointer);
			leftChild = list.get (pointer * 2 + 1);
			if (list.size() == pointer * 2 + 2)
				rightChild = 10000000;
			else
				rightChild = list.get (pointer * 2 + 2);

			if (leftChild >= parent && rightChild >= parent)
				break;

			if (leftChild < rightChild) {
				Integer temp = parent;
				list.set(pointer, leftChild);
				list.set(pointer * 2 + 1, temp);
				pointer = pointer * 2 + 1;
			} else {
				Integer temp = parent;
				list.set(pointer, rightChild);
				list.set(pointer * 2 + 2, temp);
				pointer = pointer * 2 + 2;
			}
		}
	}

	public Integer extractTop () {
		if (list.size() == 0) return -1;
		Integer top = list.get(0);
		delete (top);
		return top;
	}

	public String toString() {
		String str = "";
		for (int i=0; i<list.size(); i++) {
			str += " " + list.get(i);
		}
		return str;
	}
}
