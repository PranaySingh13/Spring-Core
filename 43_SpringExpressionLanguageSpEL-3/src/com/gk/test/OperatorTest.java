package com.gk.test;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.gk.beans.Employee;

public class OperatorTest {

	public static void main(String[] args) {

		ExpressionParser parser = new SpelExpressionParser();

		// Arithmetic Operator
		Expression expr = parser.parseExpression("10+20");
		System.out.println(expr.getValue());

		expr = parser.parseExpression("10*20");
		System.out.println(expr.getValue());

		// Logical Operator
		expr = parser.parseExpression("true and true");
		System.out.println(expr.getValue());
		expr = parser.parseExpression("true && false");
		System.out.println(expr.getValue());
		expr = parser.parseExpression("true or true");
		System.out.println(expr.getValue());
		expr = parser.parseExpression("true || false");
		System.out.println(expr.getValue());

		// Comparison Operator
		expr = parser.parseExpression("10 ne 20");
		System.out.println(expr.getValue());
		expr = parser.parseExpression("10 >= 20");
		System.out.println(expr.getValue());
		expr = parser.parseExpression("10 lt 20");
		System.out.println(expr.getValue());
		expr = parser.parseExpression("10 ge 20");
		System.out.println(expr.getValue());

		// Ternary Operator
		expr = parser.parseExpression("10 eq 10?'Condition is True':'Condition is False'");
		System.out.println(expr.getValue());
		expr = parser.parseExpression("10 eq 20?'Condition is True':'Condition is False'");
		System.out.println(expr.getValue());

		// Type Operator
		expr = parser.parseExpression("T(Thread).MIN_PRIORITY");
		System.out.println(expr.getValue());
		expr = parser.parseExpression("T(Thread).MAX_PRIORITY");
		System.out.println(expr.getValue());
		expr = parser.parseExpression("T(Integer).toString(20)");
		System.out.println(expr.getValue());

		// Safe Navigation Operator(to avoid NullPointerExceptions)
		Employee emp = new Employee();
		StandardEvaluationContext context = new StandardEvaluationContext(emp);
		expr = parser.parseExpression("empName?.toUpperCase()");
		System.out.println(expr.getValue(context));

	}

}
