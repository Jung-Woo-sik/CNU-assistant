package com.cscnu.bag;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ArrayBagSetTest 
    extends TestCase
{
	public void test() {
		ArrayBag bag = new ArrayBag();

		char temp = 'A';
		char temp2 = 'B';
		char temp3 = 'C';

		System.out.println("Adding Bag items");
		bag.add(temp);
		bag.add(temp);
		bag.add(temp2);
		bag.add(temp3);
		bag.add(temp);
		bag.add(temp2);

		assertTrue(bag.contains(temp));
		assertTrue(bag.contains(temp2));

		bag.printAll();
		
		System.out.println("Removing Bag items");
		bag.remove(temp);
		bag.remove(temp);
		bag.remove(temp3);
		
		bag.printAll();
	}
	public void test2() {
		ArraySet set = new ArraySet();

		System.out.println("Adding Set items");
		for (int i=0; i<2; i++) set.add(1);
		set.add(2);
		set.add(3);

		for (int i=1; i<4; i++) assertTrue(set.contains(i));

		set.printAll();

		System.out.println("Removing Set items");
		set.remove(2);
		set.remove(1);
		
		set.printAll();
	}
}
