package com.cscnu.tree;

import java.util.*;
public class unorderedTree {
	private Object root;
	private Set subtree;
	private int size;

	public unorderedTree() {

	}

	public unorderedTree (Object root) {
		this.root = root;
		subtree = new HashSet ();
		size = 1;
	}

	public unorderedTree (Object root, Set trees) {
		this(root);
		for (Iterator it = trees.iterator(); it.hasNext();) {
			Object object = it.next();
			if (object instanceof unorderedTree) {
				unorderedTree tree = (unorderedTree) object;
				subtree.add(tree);
				size += tree.size();
			}
		}
	}

	public int size () {
		return size;
	}
}
