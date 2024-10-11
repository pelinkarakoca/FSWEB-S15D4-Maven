package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println(convertDecimalToBinary(-13));
	}

	public static boolean checkForPalindrome(String name) {
		char[] willBeListChars = name.toLowerCase().replaceAll("[.,?!_\\-\\s]", "").toCharArray();
		List<Character> charList = new ArrayList<>();
		for (Character c : willBeListChars) {
			charList.add(c);
		}
		for (int i = 0; i < charList.size(); i++) {
			int j = charList.size() - i - 1;
			if (!charList.get(i).equals(charList.get(j))) {
				return false;
			}
		}
		return true;
	}


	public static String convertDecimalToBinary(int numToConvert) {
		return String.valueOf(recursiveBinary(numToConvert));
	}

	private static int recursiveBinary(int quotient) {
		if (quotient < 1) return quotient;
		
		int remainder = quotient % 2;
		int firstQuotient = quotient / 2;
		String strRes = String.valueOf(recursiveBinary(firstQuotient)) + String.valueOf(remainder);
		return Integer.parseInt(strRes);
	}
}
