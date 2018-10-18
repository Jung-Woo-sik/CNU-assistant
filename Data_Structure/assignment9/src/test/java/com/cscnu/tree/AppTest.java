package com.cscnu.tree;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;
import java.util.concurrent.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
extends TestCase
{
	public void test () {

		orderedTree[] tree = new orderedTree[17];
		for (int i=0; i<17; i++) {
			tree[i] = new orderedTree(i);
		}
		List list = new LinkedList();

		list.clear ();
		list.add (tree[3]);
		list.add (tree[12]);
		tree[16] = new orderedTree(16, list);

		list.clear ();
		list.add (tree[15]);
		list.add (tree[7]);
		tree[6] = new orderedTree (6, list);

		list.clear ();
		list.add (tree[11]);
		list.add (tree[16]);
		list.add (tree[2]);
		tree[10] = new orderedTree (10, list);

		list.clear ();
		list.add (tree[9]);
		tree[5] = new orderedTree (5, list);

		list.clear ();
		list.add (tree[6]);
		list.add (tree[10]);
		tree[4] = new orderedTree (4, list);

		list.clear ();
		list.add (tree[14]);
		list.add (tree[13]);
		tree[1] = new orderedTree (1, list);

		list.clear ();
		list.add (tree[5]);
		list.add (tree[4]);
		list.add (tree[1]);
		tree[8] = new orderedTree (8, list);

		list.clear ();

		orderedTree root = tree[8];

		System.out.println ("Tree Structure");
		orderedTree.printTreeStructure (root);
		System.out.println ();

		System.out.println ("Level Order Traversal");
		LinkedBlockingQueue<orderedTree> queue = new LinkedBlockingQueue ();
		queue.add (root);
		orderedTree.levelOrderTraversal (queue);
		System.out.println ();

		System.out.println ("Pre Order Traversal");
		orderedTree.preOrderTraversal (root);
		System.out.println ();
		System.out.println ();

		System.out.println ("Post Order Traversal");
		orderedTree.postOrderTraversal (root);
		System.out.println ();

		for (int i=0; i<17; i++)
			assertEquals(tree[i].toString() , String.valueOf(i));
	}
}
