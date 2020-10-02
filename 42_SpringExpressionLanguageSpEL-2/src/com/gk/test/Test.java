package com.gk.test;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.gk.beans.CalculatorBean;

public class Test {

	public static void main(String[] args) {

		CalculatorBean cal = new CalculatorBean();

		// Total CalculatorBean Information is stored in this central repository class object
		StandardEvaluationContext context = new StandardEvaluationContext(cal);

		ExpressionParser parser = new SpelExpressionParser();
		
		Expression expr1 = parser.parseExpression("num1");
		expr1.setValue(context, "10");// This value is stored in num1 variable in context cal object.
		
		Expression expr2 = parser.parseExpression("num2");
		expr2.setValue(context, "20");// This value is stored in num2 variable in context cal object.

		System.out.println("Number 1: " + cal.getNum1());
		System.out.println("Number 2: " + cal.getNum2());
		System.out.println("Addition: " + cal.addition());
		System.out.println("Subtraction: " + cal.subtraction());
		System.out.println("Multiplication: " + cal.multiplication());

	}

}
