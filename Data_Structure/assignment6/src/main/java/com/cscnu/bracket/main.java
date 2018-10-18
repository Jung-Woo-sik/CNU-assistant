package com.cscnu.bracket;

import com.cscnu.list.*;
import com.cscnu.stack.*;

public class main {
	public static void main (String[] args) {
		checker Cker = new checker();
		String input = "void main()\n{\n\tprintf();\n\tscanf();\n\n\tfor(int i=0; i<10; i++)\n\t{\n\t\tsum += i;\n\t}\n}\n";
		if (Cker.checkBracket(input)) System.out.printf(input);
		else System.out.println("error");
	}
}
