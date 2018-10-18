package com.cscnu.heap;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	public void test () {
		Maxheap maxHeap = new Maxheap ();
		Minheap minHeap = new Minheap ();

		maxHeap.insert (33);
		maxHeap.insert (88);
		maxHeap.insert (77);
		assertTrue(maxHeap.insert (52));
		assertTrue(maxHeap.insert (66));
		assertTrue(maxHeap.insert (73));
		maxHeap.insert (75);
		maxHeap.insert (44);
		maxHeap.insert (38);
		maxHeap.insert (42);
		System.out.println("Original Max Heap : " + maxHeap);
		assertTrue(maxHeap.delete (75));
		assertTrue(maxHeap.delete (38));
		assertTrue(maxHeap.delete (73));
		assertFalse(maxHeap.delete (75));
		assertFalse(maxHeap.delete (0));
		System.out.println("After Delete : " + maxHeap);
		for (int i=0; i<3; i++) {
			System.out.println("top : " + maxHeap.extractTop());
			System.out.println(maxHeap);
		}
		System.out.println("Final Heap : " + maxHeap);

		System.out.println();

		minHeap.insert (33);
		minHeap.insert (88);
		minHeap.insert (77);
		assertTrue(minHeap.insert (52));
		assertTrue(minHeap.insert (66));
		assertTrue(minHeap.insert (73));
		minHeap.insert (75);
		minHeap.insert (44);
		minHeap.insert (38);
		minHeap.insert (42);
		System.out.println("Original Min Heap : " + minHeap);
		assertTrue(minHeap.delete (75));
		assertTrue(minHeap.delete (38));
		assertTrue(minHeap.delete (73));
		assertFalse(minHeap.delete (75));
		assertFalse(minHeap.delete (0));
		System.out.println("After Delete : " + minHeap);
		for (int i=0; i<3; i++) {
			System.out.println("top : " + minHeap.extractTop());
			System.out.println(minHeap);
		}
		System.out.println("Final Heap : " + minHeap);
	}
}
