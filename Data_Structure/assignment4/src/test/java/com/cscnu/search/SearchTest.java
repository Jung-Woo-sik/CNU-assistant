package com.cscnu.search;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SearchTest extends TestCase {
	public void test () {
		IntSet set = new IntSet ();
		int MAX_CASE = 100000;
		long startTime, endTime;
		startTime = System.nanoTime();

		for (int i=0; i<MAX_CASE; i++) {
			set.add(new Integer(i));
		}
		set.remove(new Integer(8212));
		endTime = System.nanoTime();
		System.out.println("Seq Time :\t" + (endTime - startTime));

		set = new IntSet ();
		set.setBi (true);
		startTime = System.nanoTime();

		for (int i=0; i<MAX_CASE; i++) {
			set.add(new Integer(i));
		}
		set.remove(new Integer(8212));
		endTime = System.nanoTime();
		System.out.println("Bi Time :\t" + (endTime - startTime));
	}
}
