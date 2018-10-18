package com.cscnu.list;

public class main {

	public static void main (String args[]) {
		SingleLinkedList Slist = new SingleLinkedList ();

		Slist.insert("test", -1);
		Slist.insert("hello", 1);
		Slist.insert("Data", 0);
		Slist.printAll ();
		Slist.insertFirst("봄");
		Slist.printAll ();
		Slist.insertLast("여름");
		Slist.printAll ();
		Slist.insert("늦봄", 1);
		Slist.printAll ();
		Slist.insertFirst("겨울");
		Slist.printAll ();
		Slist.insertLast("가을");
		Slist.printAll ();

		System.out.println(" ========= REMOVE ========= ");
		System.out.println("");

		Slist.removeFirst ();
		Slist.printAll ();
		Slist.removeLast ();
		Slist.printAll ();
		Slist.remove(3);
		Slist.printAll ();

		DoubleLinkedList Dlist = new DoubleLinkedList ();

		Dlist.insertFirst ("hi");
		Dlist.insertLast ("hello");
		Dlist.insertLast ("안녕");
		Dlist.printAll ();
		Dlist.insert("끼어든 데이터", 1);
		Dlist.printAll ();

		System.out.println(" ========= REMOVE ========= ");
		System.out.println("");

		Dlist.removeLast ();
		Dlist.printAll ();
		Dlist.removeFirst ();
		Dlist.printAll ();
		Dlist.remove(1);
		Dlist.printAll ();
	}
}
