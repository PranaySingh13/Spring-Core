package com.gk.test;

import java.util.ArrayList;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.gk.beans.City_State;
import com.gk.beans.City_State_Collection;

public class CollectionsTest {

	public static void main(String[] args) {

		City_State_Collection collection = new City_State_Collection();
		StandardEvaluationContext context = new StandardEvaluationContext(collection);
		ExpressionParser parser = new SpelExpressionParser();
		Expression expr = parser.parseExpression("city_state.?[state=='M.P.']");
		ArrayList<City_State> list1 = (ArrayList<City_State>) expr.getValue(context);
		System.out.println(list1);

		expr = parser.parseExpression("city_state.?[city=='Mumbai']");
		ArrayList<City_State> list2 = (ArrayList<City_State>) expr.getValue(context);
		System.out.println(list2);
	}

}
