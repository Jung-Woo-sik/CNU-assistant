package com.cscnu.bst;

public class BST {
	private Node root;

	public BST() {
		this.root = null;
	}

	private class Node {
		private int key;
		private Node left, right;

		public Node (int key) {
			this.key = key;
			this.left = null;
			this.right = null;
		}
	}

	public Node getRoot () {
		return root;
	}

	public boolean find (int key) {
		Node current = root;
		while (current != null) {
			if (current.key == key) return true;
			else if (current.key > key) current = current.left;
			else current = current.right;
		}
		return false;
	}

	public boolean insert (int key) {
		Node newNode = new Node(key);
		if (root == null) {
			root = newNode;
			return true;
		}
		Node current = root;
		Node parent = null;
		while (true) {
			parent = current;
			if (key == current.key) return false;
			if (key < current.key) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
					return true;
				}
			}
			else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return true;
				}
			}
		}
	}

	public boolean delete (int key) {
		if (root == null) return false;
		Node current = root;
		Node parent = null;
		boolean isLeft = false;
		while (key != current.key) {
			parent = current;
			if (key < current.key) {
				current = current.left;
				isLeft = true;
			}
			else if (key > current.key) {
				current = current.right;
				isLeft = false;
			}
			if (current == null) return false;
		}
		// case 1
		if (current.left == null && current.right == null) {
			if (current == root) root = null;
			if (isLeft) parent.left = null;
			else parent.right = null;
		}
		// case 2
		// 2-1. left subtree is null
		else if (current.left == null) {
			if (current == root) root = current.right;
			else if (isLeft) parent.left = current.right;
			else parent.right = current.right;
		}
		// 2-2. right subtree is null
		else if (current.right == null) {
			if (current == root) root = current.left;
			else if (isLeft) parent.left = current.left;
			else parent.right = current.left;
		}
		// case 3
		else if (current.left != null && current.right != null) {
			Node child = getMinKeyFromRight(current);
			if (current == root) root = child;
			else if (isLeft) parent.left = child;
			else parent.right = child;
			child.left = current.left;
		}
		return true;
	}

	public Node getMinKeyFromRight (Node target) {
		Node child = null;
		Node parent = null;
		Node current = target.right;
		while (current != null) {
			parent = child;
			child = current;
			current = current.left;
		}
		if (child != target.right) {
			parent.left = child.right;
			child.right = target.right;
		}
		return child;
	}

	public void display (Node root) {
		if (root != null) {
			display(root.left);
			System.out.print(" " + root.key);
			display(root.right);
		}
	}
}
