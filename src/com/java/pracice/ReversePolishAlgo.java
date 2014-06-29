package com.java.pracice;

import java.util.Stack;

public class ReversePolishAlgo {

	public Integer reversePolishAlgo(String elements) {

		Stack<String> stackElem = new Stack<>();

		char[] elementArray = elements.toCharArray();

		for (Character elem : elementArray) {

			if (Character.isDigit(elem)) {
				stackElem.push(elem.toString());
			} else {

				if (stackElem.size() >= 2) {
					int num1 = Integer.valueOf(stackElem.pop());

					int num2 = Integer.valueOf(stackElem.pop());

					switch (elem) {
					case '+':
						stackElem.push(String.valueOf(num1 + num2));
						break;
					case '-':
						stackElem.push(String.valueOf(num1 - num2));
						break;
					case '/':
						stackElem.push(String.valueOf(num1 / num2));
						break;
					case '*':
						stackElem.push(String.valueOf(num1 * num2));
						break;
					}
				}

			}
		}

		return Integer.valueOf(stackElem.pop());
	}
}
