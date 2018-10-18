package com.cscnu.bst;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
extends TestCase
{
	public void test1 () {
		BST tree = new BST (); 
		tree.insert(55);
		tree.insert(22);
		tree.insert(18);
		tree.insert(44);
		tree.insert(30);
		tree.insert(27);
		tree.insert(33);
		tree.insert(77);
		tree.insert(70);
		tree.insert(88);
		tree.insert(60);
		tree.insert(74);
		tree.insert(80);
		tree.insert(94);
		tree.insert(66);
		tree.insert(63);
		tree.insert(69);
		System.out.println("Assignment 1");
		tree.display(tree.getRoot());
		System.out.println();

		assertFalse(tree.find(50));
		tree.insert(50);
		assertTrue(tree.find(50));
		tree.display(tree.getRoot());
		System.out.println();
		tree.insert(20);
		tree.display(tree.getRoot());
		System.out.println();
		tree.insert(90);
		assertTrue(tree.find(90));
		tree.display(tree.getRoot());
		System.out.println();
	}
	public void test2 () {
		BST tree = new BST (); 
		tree.insert(55);
		tree.insert(22);
		tree.insert(18);
		tree.insert(44);
		tree.insert(30);
		tree.insert(27);
		tree.insert(33);
		tree.insert(77);
		tree.insert(70);
		tree.insert(88);
		tree.insert(60);
		tree.insert(74);
		tree.insert(80);
		tree.insert(94);
		tree.insert(66);
		tree.insert(63);
		assertTrue(tree.insert(69));
		assertFalse(tree.insert(80));
		assertFalse(tree.insert(74));

		System.out.println("Assignment 2");
		tree.display(tree.getRoot());
		System.out.println();

		tree.delete (18);
		assertFalse(tree.find(18));
		tree.display(tree.getRoot());
		System.out.println();
		tree.delete (22);
		assertFalse(tree.find(22));
		tree.display(tree.getRoot());
		System.out.println();
		tree.delete (70);
		tree.display(tree.getRoot());
		System.out.println();
		tree.delete (77);
		tree.display(tree.getRoot());
		System.out.println();
	}
	public void test3 () {
		BST tree = new BST ();
		tree.insert(44);
		tree.insert(88);
		tree.insert(55);
		tree.insert(77);
		tree.insert(33);
		tree.insert(99);
		tree.insert(66);
		assertTrue(tree.insert(22));
		assertTrue(tree.insert(25));
		assertFalse(tree.insert(25));
		assertTrue(tree.insert(75));

		System.out.println("Assignment 3");
		tree.display(tree.getRoot());
		System.out.println();
	}
}
