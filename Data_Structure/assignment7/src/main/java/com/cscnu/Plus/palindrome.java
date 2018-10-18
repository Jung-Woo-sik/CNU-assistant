package com.cscnu.Plus;

import com.cscnu.CircularQueue.*;

public class palindrome {
	public boolean check (String str) {
		CQueue q = new CQueue();
		if (str.length() <= 1) return true;
		for (int i=0; i<str.length(); i++) {
			q.EnqueueRear(str.charAt(i));
		}
		do {
			if (q.size() == 1) break;
			if (!(q.DequeueRear().equals(q.DequeueFront()))) return false;
		} while(q.size() > 0);
		return true;
	}
}
