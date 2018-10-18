package com.cscnu.search;

import java.util.*;

public class IntSet implements Set {
	private static final int MAX_SIZE = 1000000;
	private int maxsize = MAX_SIZE;
	private Integer[] objects = new Integer[maxsize];
	private int size, p;
	private boolean isBi;

	public IntSet () {
		size = 0;
		p = 0;
		isBi = false;
	}

	public void add (Integer target) {
		if(contains (target))
			System.out.println("Cannot add item \" " + target + " \" : already exist!");
		else
			objects[size++] = target;
	}

	public boolean contains (Integer target) {
		if (searchIndex(target) != -1)
			return true;
		else
			return false;
	}

	public Integer getFirst () {
		p = 0;
		return objects[p++];
	}

	public Integer getNext () {
		return objects[p++];
	}

	public boolean remove (Integer target) {
		int t = searchIndex(target);
		if (t == -1) return false; // cannot find target
		else {
			System.arraycopy(objects, t+1, objects, t, size-t-1);
			objects[--size] = null;
			return true;
		}
	}

	public int size () {
		return size;
	}

	public void allPrint () {
		Integer obj = this.getFirst();
		int index = 0;
		while (obj != null) {
			if (obj == null) {
				return;
			}
			else {
				System.out.println("["+ index +"] " + obj);
				index ++;
			}
			obj = this.getNext ();
		}
	}

	public void setBi (boolean isBi) {
		this.isBi = isBi;
	}

	public boolean getBi () {
		return this.isBi;
	}

	public int searchIndex (Integer target) {
		// Sequential Search
		if (isBi == false) {
			for (int i=0; i<size; i++) {
				if (objects[i].equals(target)) {
					return i;
				}
			}
		}
		// Binary Search
		else {
			Integer[] temp = new Integer [size];
			System.arraycopy(objects, 0, temp, 0, size);
			Arrays.sort (temp);
			System.arraycopy(temp, 0, objects, 0, size);
			int p = 0, q = size-1;
			while (p <= q) {
				int index = (p+q) / 2;
				if (objects[index].equals(target)) {
					return index;
				}
				if (objects[index].intValue() < target.intValue()) {
					p = index + 1;
				} else {
					q = index - 1;
				}
			}
		}
		return -1; // failed to search
	}
}
