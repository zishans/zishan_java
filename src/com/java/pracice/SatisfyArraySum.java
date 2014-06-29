package com.java.pracice;

import java.util.List;

public class SatisfyArraySum {

	public Integer satisfyArraySum(List<Integer> list) {

		Integer number = 0;

		Integer numFound = null;

		for (Integer num : list) {

			number = number + num;

			if (list.contains(number)) {
				numFound = number;
			}

		}

		return numFound;

	}
}
