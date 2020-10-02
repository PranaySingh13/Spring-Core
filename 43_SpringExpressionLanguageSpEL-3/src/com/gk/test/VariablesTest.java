package com.gk.test;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.gk.beans.CalculatorBean;

public class VariablesTest {

	public static void main(String[] args) {
		CalculatorBean cal = new CalculatorBean();

		StandardEvaluationContext context = new StandardEvaluationContext(cal);

		/*
		 * we have called setVariable() method of StandardEvaluationContext class, which
		 * is used to set/define new variables with values.
		 */
		context.setVariable("number1", 10);
		context.setVariable("number2", 20);

		/*Note:
		 * Next, these variables are used in the String expressions, using #VariableName
		 * syntax and are passed to the method parseRaw() of ExpressionParser implemented 
		 * SpelExpressionParse class, which parses the variable in String expression and returns an expression in
		 * the form of an object of SpelExpression class.
		 */
		SpelExpressionParser parser = new SpelExpressionParser();
		
		//parseRaw() Actually parse the expression string and return an Expression object
		Expression expr1 = parser.parseRaw("num1 = #number1");
		expr1.getValue(context);

		Expression expr2 = parser.parseRaw("num2 = #number2");
		expr2.getValue(context);

		System.out.println("Addition: " + cal.addition());
		System.out.println("Subtraction: " + cal.subtraction());
		System.out.println("Multiplication: " + cal.multiplication());

	}

}
