package com.cscnu.Map;

import java.io.*;
import java.util.StringTokenizer;

public class SampleArrayMap {
	public SampleArrayMap(String file) {
		Map map = new ArrayMap();
		int lineNumber = 0;
		try {
			BufferedReader in = new BufferedReader (new FileReader(file));
			String line = in.readLine();
			while (line != null) {
				++lineNumber;
				StringTokenizer parser = new StringTokenizer(line," ,:;=.?!");
				while (parser.hasMoreTokens()) {
					String word = parser.nextToken().toUpperCase();
					String list = map.get(word);
					if (list == null) {
						map.put(word,""+lineNumber);
					} else {
						map.put(word, list+","+lineNumber);
					}
				}
				System.out.println(lineNumber+":\t"+line);
				line = in.readLine();
			}
			in.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println(map);
		System.out.println("lines: " + lineNumber);
		System.out.println("distinet word: "+map.size());
	}

	public static void main(String[] args) {
		new SampleArrayMap(args[0]);
	}
}
