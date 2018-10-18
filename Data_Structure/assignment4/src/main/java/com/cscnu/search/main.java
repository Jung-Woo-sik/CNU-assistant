package com.cscnu.search;

public class main {
	public static void main(String[] args) {
		IntSet set = new IntSet ();
		long startTime, endTime;

		if (args[0].equals("Bi")) set.setBi(true);
		else if (args[0].equals("Seq")) set.setBi(false);
		else System.exit(0);

		startTime = System.nanoTime();
		System.out.println("--- Add Item ---");
		set.add(new Integer(182));
		set.add(new Integer(84291));
		set.add(new Integer(3942));
		set.add(new Integer(829));
		set.add(new Integer(12282));
		set.add(new Integer(842));
		set.add(new Integer(12));
		set.add(new Integer(4821));
		set.add(new Integer(182));
		set.add(new Integer(480));
		set.add(new Integer(4921));
		set.add(new Integer(481));
		set.add(new Integer(8123));
		set.add(new Integer(821));
		set.add(new Integer(526));
		set.add(new Integer(542));
		set.add(new Integer(42));
		set.add(new Integer(482));
		set.allPrint();
		System.out.println("--- Remove Items ---");
		set.remove(new Integer(829));
		set.remove(new Integer(12));
		set.remove(new Integer(829));
		set.remove(new Integer(84291));
		set.remove(new Integer(1888888));
		set.allPrint();
		endTime = System.nanoTime();

		System.out.println("Time : \t" + (endTime-startTime));
	}
}
