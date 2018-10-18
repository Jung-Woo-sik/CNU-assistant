package com.cscnu.Map;

import com.cscnu.List.*;

public class DLLMap implements Map {
	private DoubleLinkedList list = new DoubleLinkedList();

	public String get(String key) {
		int size = list.getSize();
		for (int i=1; i<=size; i++) {
			Entry ComEntry = (Entry) list.getNode(i).data;
			if (ComEntry.key.equals(key)) {
				return ComEntry.value;
			}
		}
		return null;
	}

	public String put (String key, String value) {
		Node s = list.getFirst();
		Entry e = new Entry(key, value);
		Entry data = null;
		Entry nextData = null;
		int p = 1;
		int size = list.getSize();
		if (size == 0) {
			list.insertFirst(e);
			return null;
		}
		for (int i=1; i<=size; i++) {
			data = (Entry) list.getNode(i).data;
			if (data.key.equals(key)) {
				return data.setValue(value);
			}   
		}
		data = (Entry) list.getFirst().data;
		if (key.compareTo(data.key) < 0) {
			list.insertFirst(e);
			return null;
		}
		s = list.getFirst();
		while (s.next != null) {
			data = (Entry) s.data;
			nextData = (Entry) s.next.data;
			if (key.compareTo(data.key) > 0 && key.compareTo(nextData.key) < 0) {
				list.insert(e, ++p);
				return null;
			}
			s = s.next;
			p ++;
		}
		list.insertLast(e);
		return null;
	}

	public int size() {
		return list.getSize();
	}

	public String toString () {
		StringBuffer buf = new StringBuffer();
		int size = list.getSize();
		for (int i=1; i<=size; i++) {
			Entry e = (Entry) list.getNode(i).data;
			buf.append(e + "\n");
		}
		return buf.toString();
	}
}
