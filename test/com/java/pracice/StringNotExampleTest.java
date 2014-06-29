package com.java.pracice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringNotExampleTest {

	private StringNotExample stringNotExample;

	@Before
	public void setUp() {
		stringNotExample = new StringNotExample();
	}

	@Test
	public void testNotString() {

		String test1 = "not Zishan";

		assertEquals(test1, stringNotExample.notString(test1));
		
		String test2 = "Zishan";
		
		assertEquals(test1, stringNotExample.notString(test2));
	}

}
