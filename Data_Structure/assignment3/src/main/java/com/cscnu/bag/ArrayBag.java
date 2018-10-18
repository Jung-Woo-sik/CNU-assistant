package com.cscnu.bag;

public class ArrayBag implements Bag {
	private static final int MAX_SIZE = 100;
	private int maxsize = MAX_SIZE;
	private Object[] objects = new Object[maxsize];
	private int size,i;

	public void add (Object object) {
		objects[size++] = object;
	}

	public boolean contains (Object object) {
		for (int i=0; i<size; i++) {
			if (objects[i] == object) {
				return true;
			}
		}
		return false;
	}

	public Object getFirst () {
		i = 0;
		return objects[i++];
	}

	public Object getNext () {
		return objects[i++];
	}

	public boolean remove (Object object) {
		for (int i=0; i<size; i++) {
			if (objects[i] == object) {
				System.arraycopy(objects, i+1, objects, i, size-i-1);
				objects[--size] = null;
				return true;
			}
		}
		return false;
	}

	public void printAll () {
		Object obj = this.getFirst ();
		while(obj != null) {
			if (obj == null) {
				return;
			}
			else {
				System.out.println(obj);
			}
			obj = this.getNext ();
		}
	}

	public int size () {
		return size;
	}
}
