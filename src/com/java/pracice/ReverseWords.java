package com.java.pracice;

import java.util.Arrays;
import java.util.List;

public class ReverseWords {

	public String reverseWords(String sentence) {

		String[] words = sentence.split("\\s+");

		List<String> wordsList = Arrays.asList(words);

		StringBuilder stringBuilder = null;
		
		StringBuilder finalString = new StringBuilder();

		for (String word : wordsList) {

			stringBuilder = new StringBuilder();

			stringBuilder.append(word+" ");

			stringBuilder.reverse();
			
			finalString.append(stringBuilder);
		}

		return finalString.toString();

	}
}
