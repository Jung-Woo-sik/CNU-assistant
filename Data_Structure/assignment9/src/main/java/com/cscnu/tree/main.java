package com.cscnu.tree;

import java.util.*;
import java.util.concurrent.*;

public class main {
	public static void main (String[] args) {
		unorderedTree utreeA, utreeB, utreeD;
		unorderedTree utreeC = new unorderedTree("C");

		unorderedTree utreeE = new unorderedTree("E");

		unorderedTree utreeF = new unorderedTree("F");

		unorderedTree utreeG = new unorderedTree("G");

		Set<Object> subtreeOfuB = new HashSet<Object>();
		subtreeOfuB.add(utreeE);
		subtreeOfuB.add(utreeF);
		utreeB = new unorderedTree("B", subtreeOfuB);

		Set<Object> subtreeOfuD = new HashSet<Object>();
		subtreeOfuD.add(utreeG);
		utreeD = new unorderedTree("D", subtreeOfuD);

		Set<Object> subtreeOfuA = new HashSet<Object>();
		subtreeOfuA.add(utreeB);
		subtreeOfuA.add(utreeC);
		subtreeOfuA.add(utreeD);

		utreeA = new unorderedTree("A", subtreeOfuA);

		// ordered tree
		orderedTree treeA, treeB, treeD;
		orderedTree treeC = new orderedTree ("C");
		orderedTree treeE = new orderedTree ("E");
		orderedTree treeF = new orderedTree ("F");
		orderedTree treeG = new orderedTree ("G");

		List subtreesOfB = new LinkedList ();
		subtreesOfB.add (treeE);
		subtreesOfB.add (treeF);
		treeB = new orderedTree("B",subtreesOfB);

		List subtreesOfD = new LinkedList ();
		subtreesOfD.add(treeG);
		treeD = new orderedTree ("D", subtreesOfD);

		List subtreesOfA = new LinkedList ();
		subtreesOfA.add (treeB);
		subtreesOfA.add (treeC);
		subtreesOfA.add (treeD);
		treeA = new orderedTree ("A", subtreesOfA);

		// Level - order
		LinkedBlockingQueue<orderedTree> queue = new LinkedBlockingQueue();
		queue.add(treeA);
		orderedTree.levelOrderTraversal (queue);

		// Pre - order
		orderedTree.preOrderTraversal (treeA);
		System.out.println();

		// Post - order
		orderedTree.postOrderTraversal (treeA);
		System.out.println();
	}
}
