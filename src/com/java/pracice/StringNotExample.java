package com.java.pracice;

public class StringNotExample {

	public String notString(String str) {

		if (str.startsWith("not")) {
			return str;
		} else {
			str = "not " + str;
		}

		return str;

	}
}
