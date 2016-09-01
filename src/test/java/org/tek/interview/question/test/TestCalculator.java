package org.tek.interview.question.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tek.interview.question.Item;
import org.tek.interview.question.Order;
import org.tek.interview.question.OrderLine;
import org.tek.interview.question.calculator;

public class TestCalculator {
	
	
	Order c1;
	calculator calculator;
	Map<String, Order> o;

	@Before
	public void init() throws Exception{
		o = new HashMap<String, Order>();

		c1 = new Order();
		calculator = new calculator(); 

		double grandTotal = 0;

		c1.add(new OrderLine(new Item("book", (float) 12.49), 1));
		c1.add(new OrderLine(new Item("music CD", (float) 14.99), 1));
		c1.add(new OrderLine(new Item("chocolate bar", (float) 0.85), 1));

		o.put("Order 1", c1);

    }
	
	@Test
	public void testRounding(){
		Assert.assertEquals(2.24, calculator.rounding(2.2365),0);
	}
	
	

}
