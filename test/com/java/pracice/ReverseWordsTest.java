package com.java.pracice;

import org.junit.Test;

public class ReverseWordsTest {

	@Test
	public void test() {
		ReverseWords reverseWords = new ReverseWords();
		
		String response = reverseWords.reverseWords("Hello my name is zishan");
		
		System.out.println("Response: "+response);
	}

}
