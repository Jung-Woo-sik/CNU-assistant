package com.cscnu.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase {
		public void test() {
			DLLMap map = new DLLMap();
			map.put ("Cat", "1,2,3");
			map.put ("Apple", "5");
			map.put ("Boy", "4,2,8");
			assertEquals(map.get("Apple"), "5");
			assertEquals(map.get("Boy"), "4,2,8");
			assertEquals(map.get("Cat"), "1,2,3");
			assertEquals(map.get("Dog"), null);
			System.out.println(map);
			map.put ("Aap", "8,12,24");
			map.put ("Dog", "4,5,6");
			System.out.println(map);
			assertEquals(map.get("Aap"), "8,12,24");
			assertEquals(map.get("Dog"), null);
		}
}
