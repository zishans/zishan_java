package com.java.pracice;

import static junit.framework.Assert.*;

import org.junit.Test;

public class ReversePolishAlgoTest {

	@Test
	public void test() {
		ReversePolishAlgo reversePolishAlgo = new ReversePolishAlgo();

		String eq = "21+3*";

		assertEquals(new Integer(9), reversePolishAlgo.reversePolishAlgo(eq));
		
		eq = "32*4-";
		
		assertEquals(new Integer(-2
				
				), reversePolishAlgo.reversePolishAlgo(eq));

	}

}
