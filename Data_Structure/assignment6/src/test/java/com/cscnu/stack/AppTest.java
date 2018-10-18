package com.cscnu.stack;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase {
		public void test () {
			Stack stack = new ListStack ();
			final int MAX_STACK_DATA = 10000;

			for (int i=1; i<=MAX_STACK_DATA; i++) {
				stack.push(i);
			}
			System.out.println("pop : " + stack.pop());
			System.out.println("pop : " + stack.pop());
			System.out.println("pop : " + stack.pop());
			System.out.println("pop : " + stack.pop());
			System.out.println("pop : " + stack.pop());

			assertFalse(stack.isEmpty());
			assertEquals(stack.size(), MAX_STACK_DATA-5);
			for (int i=MAX_STACK_DATA-5; i>0; i--) {
				assertEquals(stack.peek(), i);
				int data = (int) stack.pop();
				assertEquals(data, i);
				System.out.println("pop : " + data);
			}
			assertTrue(stack.isEmpty());
			stack.pop(); // throw exception
		}
}
