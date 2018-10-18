package com.cscnu.heap;

public class main {
	public static void main (String[] args) {
		Maxheap mh = new Maxheap();
		mh.insert (33);
		mh.insert (88);
		mh.insert (77);
		mh.insert (52);
		mh.insert (66);
		mh.insert (73);
		mh.insert (75);
		mh.insert (44);
		mh.insert (38);
		mh.insert (42);
		System.out.println(mh);
		mh.delete (33);
		System.out.println(mh);
		mh.delete (88);
		System.out.println(mh);
		mh.delete (75);
		System.out.println(mh);

		Minheap minh = new Minheap();
		minh.insert (33);
		minh.insert (88);
		minh.insert (77);
		minh.insert (52);
		minh.insert (66);
		minh.insert (73);
		minh.insert (75);
		minh.insert (44);
		minh.insert (38);
		minh.insert (42);
		System.out.println(minh);
		System.out.println(minh.extractTop());
		System.out.println(minh);
		System.out.println(minh.extractTop());
		System.out.println(minh);
		minh.delete (88);
		minh.delete (42);
		System.out.println(minh);
	}
}
