package com.bridgelabz.algorithmprogram;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
	public static void checkanagram(String first, String second) {
		if (first.length() == second.length()) {

			char[] ch1 = first.toCharArray();
			char[] ch2 = second.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			String s1 = Arrays.toString(ch1);
			String s2 = Arrays.toString(ch2);

			if (s1.equalsIgnoreCase(s2)) {
				System.out.println("This is an Anagram String");
			} else {
				System.out.println("This is not an Anagram String");
			}

		}

	}

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		String first = number.next();
		String second = number.next();
		checkanagram(first, second);
	}

}