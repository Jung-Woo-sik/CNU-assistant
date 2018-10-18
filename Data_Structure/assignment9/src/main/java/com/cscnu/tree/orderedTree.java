package com.cscnu.tree;

import java.util.*;
import java.util.concurrent.*;

public class orderedTree {
	private Object root;
	private LinkedList subtrees;
	private int size;
	private static int level = 0;
	public orderedTree() {

	}

	public orderedTree (Object root) {
		this.root = root;
		subtrees = new LinkedList();
		this.size = 1;
	}

	public orderedTree (Object root, List trees) {
		this(root);
		for(Iterator it = trees.iterator(); it.hasNext();) {
			Object object = it.next();
			if (object instanceof orderedTree) {
				orderedTree tree = (orderedTree) object;
				subtrees.add(tree); size += tree.size();
			}
		}
	}

	public int size() {
		return size;
	}

	public LinkedList getSubtrees () {
		return subtrees;
	}
	
	public Object getRoot () {
		return root;
	}

	public String toString () {
		return root.toString();
	}

	public static void printTreeStructure (orderedTree node) {
		if (level < 0) level = 0;
		for (int i=0; i<level; i++) System.out.print("\t");
		System.out.print(node.toString() + "\n");
		LinkedList sub = node.getSubtrees ();
		if (sub.size() == 0) {
			level --;
			return;
		}
		for (Iterator it = sub.iterator(); it.hasNext(); ) {
			Object object = it.next();
			if (object instanceof orderedTree) {
				orderedTree tree = (orderedTree) object;
				level ++;
				printTreeStructure (tree);
			}
		}
		level --;
	}

	public static void levelOrderTraversal (LinkedBlockingQueue<orderedTree> queue) {
		orderedTree node = queue.remove();
		System.out.print (node.toString() + " ");
		LinkedList sub = node.getSubtrees ();
		for (Iterator it = sub.iterator(); it.hasNext(); ) {
			Object object = it.next();
			if (object instanceof orderedTree) {
				orderedTree tree = (orderedTree) object;
				queue.add (tree);
			}
		}
		if (queue.size() == 0) System.out.println ();
		else levelOrderTraversal (queue);
		return;
	}

	public static void preOrderTraversal (orderedTree node) {
		System.out.print (node.toString() + " ");
		LinkedList sub = node.getSubtrees ();
		if (sub.size() == 0) {
			return;
		}
		for (Iterator it = sub.iterator(); it.hasNext(); ) {
			Object object = it.next();
			if (object instanceof orderedTree) {
				orderedTree tree = (orderedTree) object;
				preOrderTraversal (tree);
			}
		}
	}

	public static void postOrderTraversal (orderedTree node) {
		LinkedList sub = node.getSubtrees ();
		if (sub.size () == 0) {
			System.out.print (node.toString() + " ");
			return;
		}
		for (Iterator it = sub.iterator(); it.hasNext(); ) {
			Object object = it.next ();
			if (object instanceof orderedTree) {
				orderedTree tree = (orderedTree) object;
				postOrderTraversal (tree);
			}
		}
		System.out.print (node.toString() + " ");
	}
}
