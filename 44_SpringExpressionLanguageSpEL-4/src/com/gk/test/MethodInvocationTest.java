package com.gk.test;

import java.lang.reflect.Method;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class MethodInvocationTest {

	public static void main(String[] args) throws Exception {

		// First Prepare the class object
		Class<?> cls = Class.forName("com.gk.beans.MyString");

		// Then get the method object of class
		Method method = cls.getDeclaredMethod("reverseString", new Class[] { java.lang.String.class });

		StandardEvaluationContext context = new StandardEvaluationContext();

		// register the method with name
		context.registerFunction("reverse", method);
		context.setVariable("str", "GK Software Solutions");
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr = parser.parseExpression("#reverse(#str)");
		System.out.println(expr.getValue(context));

		// Accessing Predefined methods
		expr = parser.parseExpression("new java.util.Date().toString()");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("'GK Software Solutions'.toUpperCase()");
		System.out.println(expr.getValue());
	}

}
