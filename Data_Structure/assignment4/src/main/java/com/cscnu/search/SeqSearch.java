package com.cscnu.search;

public class SeqSearch implements Search {
	private int[] array;

	public SeqSearch(int[] input) {
		this.array = input;
	}

	public int search(int target) {
		for (int i=0; i<array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -array.length;
	}
}
