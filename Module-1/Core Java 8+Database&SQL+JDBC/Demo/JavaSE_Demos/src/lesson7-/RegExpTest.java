package com.capgemini.lesson8;

import java.util.regex.*;

public class RegExpTest {
	public static void main(String[] args) {
		String inputStr = "Test String";
		String patern = "Test String";
		boolean patternMatched = Pattern.matches(patern, inputStr);
		System.out.println(patternMatched);

		/*
		 * Pattern pattern1 = Pattern.compile(","); String[] str =
		 * pattern1.split("Shop,Mop,Hopping,Chopping"); for (String st : str) {
		 * System.out.println(st); }
		 */
		String input = "Shop,Mop,Hopping,Chopping";
		Pattern pattern = Pattern.compile("hop");
		Matcher matcher = pattern.matcher(input);
		System.out.println(matcher.matches());
		while (matcher.find()) {
			System.out.println(matcher.group() + ": " + matcher.start() + ": "
					+ matcher.end());
		}
	}
}
