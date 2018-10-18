package com.cscnu.Plus;

public class main {
	public static void main (String [] args) {
		palindrome p = new palindrome();
		if (p.check("A")) System.out.println("TRUE");
		if (p.check("AA")) System.out.println("TRUE");
		if (p.check("ABC")) System.out.println("TRUE");
		if (p.check("ASA")) System.out.println("TRUE");
		if (p.check("AAD")) System.out.println("TRUE");
		if (p.check("ASAS")) System.out.println("TRUE");
		if (p.check("123454321")) System.out.println("TRUE");
	}
}
