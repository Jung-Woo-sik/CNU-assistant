package com.cscnu.list;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class myTest extends TestCase {
	public void testSingleLinkedList () {
		SingleLinkedList Slist = new SingleLinkedList ();

		Slist.insertLast ("The End");
		Slist.insertFirst ("Hello, World!");
		Slist.insert ("Node [1] maybe", 1);
		Slist.printAll ();

		assertFalse (Slist.insert ("Unapproved insert.", 4));
		assertTrue (Slist.insert ("Approved insert.", 3));
		assertEquals (Slist.search ("Approved insert."), 3);
		assertFalse (Slist.remove (4));
		assertTrue (Slist.remove (3));
		assertEquals (Slist.getNode(0), Slist.getFirst());
	}
	public void testDoubleLinkedList () {
		DoubleLinkedList Dlist = new DoubleLinkedList ();

		Dlist.insertFirst ("hello, world!");
		Dlist.removeFirst ();
		Dlist.insertFirst ("Hi");
		Dlist.insertLast ("SeongMin!");
		Dlist.insert ("My name is", 1);
		Dlist.printAll ();
		Dlist.insertLast ("봄");
		Dlist.insertLast ("여름");
		Dlist.insertLast ("가을");
		Dlist.insertLast ("겨울");
		Dlist.printAll ();
		Dlist.removeFirst ();
		Dlist.printAll ();
		Dlist.removeLast ();
		Dlist.printAll ();
		Dlist.remove (2);
		Dlist.printAll ();

		assertFalse (Dlist.remove (4));
		assertFalse (Dlist.remove (-10));
		assertFalse (Dlist.insert ("Unapproved insert.", -5));
		assertEquals (Dlist.getNode(0), Dlist.getFirst());
		assertFalse (Dlist.insert ("Hello, world!", -10));
		assertEquals (Dlist.search ("봄"), -1);
		assertEquals (Dlist.search ("SeongMin!"), 1);
		assertEquals (Dlist.search ("Hello!"), -1);
	}
}
