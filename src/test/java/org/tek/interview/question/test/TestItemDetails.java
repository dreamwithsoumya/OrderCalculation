package org.tek.interview.question.test;


import org.junit.Assert;
import org.junit.Test;
import org.tek.interview.question.Item;

public class TestItemDetails {
	
	Item item = new Item("Book",10.0f);
	
	@Test
	public void testGetDescription(){
		Assert.assertEquals("Book",item.getDescription());
	}
	
	@Test
	public void testGetPrice(){
		Assert.assertEquals(10.0, item.getPrice(), 0.0);;
	}

}
