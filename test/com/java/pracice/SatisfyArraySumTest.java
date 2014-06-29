package com.java.pracice;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SatisfyArraySumTest {

	private SatisfyArraySum satisfyArraySum;
	
	@Test
	public void test() {
		satisfyArraySum = new SatisfyArraySum();
		
		List<Integer> listNum = Arrays.asList(new Integer[]{-6,2,4,8});
		
		assertEquals(true, listNum.contains(satisfyArraySum.satisfyArraySum(listNum)));
		
	}

}
