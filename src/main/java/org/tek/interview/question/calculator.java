package org.tek.interview.question;

import java.util.Map;

public class calculator {


	public static double rounding(double value) {

		return Math.round(value*100.0)/100.0; // round() function rounds the double value to 2 digit 

	}

	/**
	 * receives a collection of orders. For each order, iterates on the order lines and calculate the total price which
	 * is the item's price * quantity * taxes.
	 * 
	 * For each order, print the total Sales Tax paid and Total price without taxes for this order
	 */
	public void calculate(Map<String, Order> o) {

		double grandtotal = 0;

		// Iterate through the orders
		for (Map.Entry<String, Order> entry : o.entrySet()) {
			System.out.println("*******" + entry.getKey() + "*******");
			//grandtotal = 0;          // we can not initialize grand total inside loop. It will make it zero everytime.

			Order r = entry.getValue();
			//System.out.println(r.size());

			double totalTax = 0;
			double total = 0;

			// Iterate through the items in the order
			for (int i = 0; i < r.size(); i++) {    // array size is n means iterate from 0 to size()-1

				// Calculate the taxes
				double tax = 0;

				if (r.get(i).getItem().getDescription().contains("imported")) {
					tax = rounding(r.get(i).getItem().getPrice() * 0.15); // Extra 15% tax on
					// imported items
					//System.out.println("imported : "+ r.get(i).getItem().getDescription()+ "is" + tax);

				} else {
					tax = rounding(r.get(i).getItem().getPrice() * 0.10);
					//System.out.println("not imported : "+ r.get(i).getItem().getDescription()+ "is" + tax);
				}

				// Calculate the total price
				double totalprice = r.get(i).getItem().getPrice() + rounding(tax);

				// Print out the item's total price
				System.out.println(r.get(i).getItem().getDescription() + ": " + rounding(totalprice));

				// Keep a running total
				totalTax += tax;
				total += totalprice;  // totalprice is calculated . but not used. accessing old values
			}

			// Print out the total taxes
			System.out.println("Sales Tax: " + rounding(totalTax));

			total = total + totalTax;

			// Print out the total amount
			System.out.println("Total: " + rounding(total));  
			grandtotal += total;
		}

		System.out.println("Sum of orders: " + rounding(grandtotal) );
	     
	}
	
	
}
