package com.cscnu.stack;

public class main {
	public static void main (String [] args) {
		Stack stack = new ListStack ();

		stack.push("1st");
		stack.push("2nd");
		stack.push("3rd");
		stack.push("4th");
		stack.push("5th");

		System.out.println("stack size : " + stack.size() + " stack peek : " + stack.peek());
		System.out.println("stack pop : " + stack.pop());
		System.out.println("stack pop : " + stack.pop());
		System.out.println("stack pop : " + stack.pop());
		System.out.println("stack size : " + stack.size() + " stack peek : " + stack.peek());

		stack.push("6th");
		stack.push("7th");
		System.out.println("stack size : " + stack.size() + " stack peek : " + stack.peek());
		System.out.println("stack pop : " + stack.pop());
		System.out.println("stack pop : " + stack.pop());
		System.out.println("stack pop : " + stack.pop());
		System.out.println("stack pop : " + stack.pop());
		System.out.println("stack pop : " + stack.pop());
	}
}
