package com.cscnu.bag;

public class SampleSet {
	public static void main (String args[]) {
		ArraySet as = new ArraySet ();
		as.add('a');
		as.add('b');
		as.add('c');
		as.add('a');
		as.add('d');
		as.add('b');
		as.add('c');
		as.add('e');
		as.printAll ();
	}
}
