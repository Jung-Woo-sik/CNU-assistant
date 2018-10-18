package com.cscnu.search;

public class BiSearch implements Search {

	private int[] array;

	public BiSearch(int[] input) {
		this.array = input;
	}

	public int search (int target) {
		int p = 0, q = array.length-1;
		while (p <= q) {
			int index = (p+q)/2;
			if (array[index] == target) {
				return index;
			}
			if (array[index] < target) {
				p = index+1;
			}
			else {
				q = index-1;
			}
		}
		return -p-1;
	}
}
