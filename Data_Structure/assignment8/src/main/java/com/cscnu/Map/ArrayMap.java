package com.cscnu.Map;

public class ArrayMap implements Map {
	public static final int INITIAL_LENGTH = 10;
	private Entry[] a = new Entry[INITIAL_LENGTH];
	int size = 0;

	public String get (String key) {
		for (int i=0; i<size; i++) {
			if (a[i].key.equals(key)) {
				return a[i].value;
			}
		}
		return null;
	}

	public String put (String key, String value) {
		for (int i=0; i<size; i++) {
			if (a[i].key.equals(key)) {
				return a[i].setValue(value);
			}
		}
		if (size == a.length) {
			resize();
		}
		a[size++] = new Entry(key, value);
		return null;
	}
	
	public void resize () {
		Entry [] aa = new Entry[2*a.length];
		System.arraycopy(a, 0, aa, 0, a.length);
		a = aa;
	}

	public int size () {
		return size;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();
		for (int i=0; i<size; i++) {
			buf.append(a[i] + "\n");
		}
		return buf.toString();
	}
}
