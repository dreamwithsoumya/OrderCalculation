package org.tek.interview.question.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.tek.interview.question.Item;
import org.tek.interview.question.OrderLine;

public class TestOrderLine {
	Item item;
	OrderLine orderLine;
	
	@Before
	public void init() throws Exception{
		item = new Item("Book",10.0f);
		orderLine = new OrderLine(item,2);
    }
	@Test
	public void testGetQuantity(){
		Assert.assertEquals(2, orderLine.getQuantity());
	}

	@Test(expected=AssertionError.class)
	public void testQuantityMoreThanZero() throws Exception{
		//item=null;
		new OrderLine(item,0);
		
	}
	@Test(expected=Exception.class)
	public void testItemNotNull() throws Exception{
		item=null;
		new OrderLine(item,1);
		
	}

		
	
	

}
