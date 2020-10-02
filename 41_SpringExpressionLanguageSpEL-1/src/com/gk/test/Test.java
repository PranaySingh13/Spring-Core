package com.gk.test;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {

		// Prepare Expression Parser for parsing and evaluate Expression
		ExpressionParser parser = new SpelExpressionParser();

		// Note:- It is able to represent single Expression(not value)
		Expression expr = parser.parseExpression("10+20");

		// To get expression result
		int value1 = (Integer) expr.getValue();
		System.out.println(value1);

		expr = parser.parseExpression("10-20");
		int value4 = (Integer) expr.getValue();
		System.out.println(value4);

		expr = parser.parseExpression("10*20");
		int value2 = (Integer) expr.getValue();
		System.out.println(value2);

		expr = parser.parseExpression(" 'pranay' + '.' + 'singh' + '.' + '1393' + '@' + 'gmail' + '.' + 'com' ");
		String value3 = (String) expr.getValue();
		System.out.println(value3);
	}

}
