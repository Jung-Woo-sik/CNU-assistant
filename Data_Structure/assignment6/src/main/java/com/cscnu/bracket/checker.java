package com.cscnu.bracket;

import com.cscnu.list.*;
import com.cscnu.stack.*;

public class checker {
	private Stack stack;
	public checker () {
		this.stack = new ListStack ();
	}
	public boolean checkBracket (String input) {
		char[] ch = input.toCharArray();
		for (int i=0; i<input.length(); i++) {
			if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') stack.push(ch[i]);
			else if (ch[i] == ')' || ch[i] == '}' || ch[i] == ']') {
				char tmp = (char) stack.pop();
				if (!((tmp == '(' && ch[i] == ')') ||
							(tmp == '{' && ch[i] == '}') ||
							(tmp == '[' && ch[i] == ']'))) {
					return false;
				}
			}
		}
		if (!stack.isEmpty()) return false;
		else return true;
	}
}
