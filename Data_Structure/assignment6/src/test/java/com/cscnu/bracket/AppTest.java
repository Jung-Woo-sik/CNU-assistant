package com.cscnu.bracket;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase {
		public void test () {
			checker Cker = new checker ();
			String input = "#include <stdio.h>\nvoid main()\n{\n\tprintf(\"Hello, World!\");\n\treturn 0;\n}\n";
			if (Cker.checkBracket(input)) System.out.printf(input);
			else System.out.println("error");
		}
		public void test2 () {
			checker Cker = new checker ();
			String input = "include <stdio.h>\nvoid main()\n{\n\tint a;\n\tscanf(\"d\", &a);\n\tprintf(\"d\",a);\n\treturn 0;\n}";
			if (Cker.checkBracket(input)) System.out.printf(input);
			else System.out.println("error");
		}
		public void test3 () {
			checker Cker = new checker ();
			String input = "package com.cscnu.stack;\n\npublic class Stack {\n\tpublic static void main () {\n\t\tStack stack = new LinkedStack ();\n\t\tstack.pop(); // throw exception\n\t}\n}\n";
			if (Cker.checkBracket(input)) System.out.printf(input);
			else System.out.println("error");
		}
		public void test4 () {
			checker Cker = new checker ();
			String input = "void main ()\n{\n\tprintf(";
			if (Cker.checkBracket(input)) System.out.printf(input);
			else System.out.println("error");
		}
		public void test5 () {
			checker Cker = new checker ();
			String input = "({[})]";
			if (Cker.checkBracket(input)) System.out.printf(input);
			else System.out.println("error");
		}
}
