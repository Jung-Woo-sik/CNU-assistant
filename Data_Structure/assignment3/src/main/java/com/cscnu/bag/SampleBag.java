package com.cscnu.bag;

public class SampleBag {
	public static void main (String args[]) {
		int i = 0;
		ArrayBag ab = new ArrayBag ();
		for (i=0; i<20; i+=2) ab.add (i);
		ab.printAll ();

		System.out.println("========= remove items =========");

		for (i=0; i<10; i++) ab.remove (i);
		ab.printAll ();
	}
}
