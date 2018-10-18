package com.cscnu.bst;

public class main {
	public static void main (String[] args) {
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
		tree.display(tree.getRoot());
		System.out.println();

		tree.delete(74);
		tree.display(tree.getRoot());
		System.out.println();

		tree.insert(74);
		tree.delete(44);
		tree.display(tree.getRoot());
		System.out.println();

		tree.insert(44);
		tree.delete(55);
		tree.display(tree.getRoot());
		System.out.println();

		tree.insert(55);
		tree.display(tree.getRoot());
		System.out.println();
	}
}
