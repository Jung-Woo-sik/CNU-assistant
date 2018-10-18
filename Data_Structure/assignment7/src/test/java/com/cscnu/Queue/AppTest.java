package com.cscnu.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.cscnu.CircularQueue.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
extends TestCase
{
	public void test () {
		CircularDoubleLinkedList l = new CircularDoubleLinkedList ();
		l.insertFirst("봄");
		l.insertLast("여름");
		l.insertLast("가을");
		l.insertFirst("겨울");
		l.printAll();

		l.removeFirst();
		l.printAll();
		l.removeLast();
		l.printAll();

		l.insertFirst("1");
		l.insertLast("3");
		l.printAll();
		l.insert("데이터",2);
		l.printAll();
		l.insert("처음",0);
		l.insert("끝",6);
		l.printAll();
		
		l.removeFirst();
		l.removeLast();
		l.printAll();

		l.remove(2);
		l.printAll();

		System.out.println("search 1 : " + l.search("1"));
		System.out.println("search 3 : " + l.search("3"));
		System.out.println("search 봄 : " + l.search("봄"));
		System.out.println("search 끝 : " + l.search("끝"));
		System.out.println("search 여름 : " + l.search("여름"));
		System.out.println("search 데이터 : " + l.search("데이터"));
	}
	public void test2 () {
		CQueue q = new CQueue();
		q.EnqueueFront("봄");
		q.EnqueueRear("여름");
		q.EnqueueRear("가을");
		q.EnqueueRear("겨울");
		q.EnqueueRear("끝");
		q.printAll();
		System.out.println("Deq Front : " + q.DequeueFront());
		System.out.println("Deq Front : " + q.DequeueFront());
		System.out.println("Deq Rear : " + q.DequeueRear());
		q.printAll();
		System.out.println("Deq Rear : " + q.DequeueRear());
		System.out.println("Deq Rear : " + q.DequeueRear());
		System.out.println("Deq Rear : " + q.DequeueRear());
	}
}
