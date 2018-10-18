package com.cscnu.search;

import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		int [] temp = {66, 44, 99, 33, 55, 22, 88, 77, 11};

		SeqSearch seq = new SeqSearch(temp);

		System.out.println("---배열 temp(size="+temp.length+")의 원소");

		System.out.println(temp);
		System.out.println("순차탐색(44): "+seq.search(44));
		System.out.println("순차탐색(77): "+seq.search(77));

		Arrays.sort(temp);

		BiSearch bi = new BiSearch(temp);

		System.out.println("--- 배열 temp 오름차순 정렬---");
		System.out.println("--- 배열 temp(size="+temp.length+")의 원소");
		System.out.println(temp);
		System.out.println("이진탐색(44): "+bi.search(44));
		System.out.println("이진탐색(77): "+bi.search(77));

		return;
    }
}
