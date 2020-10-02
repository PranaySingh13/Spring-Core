package com.gk.test;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class LiteralRegularExpressionTest {

	public static void main(String[] args) {

		ExpressionParser parser = new SpelExpressionParser();

		// Literal(Only Constants) Expression
		Expression expr = parser.parseExpression("10+20");
		System.out.println(expr.getValue());
		System.out.println("------");
		
		expr = parser.parseExpression("'abc'+'def'");
		System.out.println(expr.getValue());
		System.out.println("------");
		
		// Regular Expression
		// matches operator check whether the provided String is satisifying the
		// provided Regular Expression or not.
		expr = parser.parseExpression("'Spring' matches 'Sp.*'");
		System.out.println(expr.getValue());
		System.out.println("------");
		
		// [a-z] means any character any no of time we can use
		expr = parser.parseExpression("'pranay.singh.1393@gmail.com' matches '[a-z]*@gmail.com'");
		System.out.println(expr.getValue());
		System.out.println("------");
		
		expr = parser.parseExpression("'pranay@gmail.com' matches '[a-z]*@gmail.com'");
		System.out.println(expr.getValue());
	}

}
