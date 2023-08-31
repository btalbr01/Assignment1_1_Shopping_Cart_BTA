import java.util.*;
public class ShoppingCart {

	public static void main(String[] args) {
		int totalCost = 0;
		BagInterface<Item> shoppingCart = new ArrayBag<Item>();
		
		//checks if the initial cart is empty
		if(shoppingCart.isEmpty())
			System.out.println("The cart is empty");
		else System.out.println("The cart is not empty");
		
		//creates Item objects - names and prices
		Item[] items = {new Item("Cheese", 599),
						new Item("Wrench", 1299),
						new Item("Vacuum", 5599),
						new Item("Jeans", 2299),
						new Item("Ice Cream", 499),
						new Item("Cheese", 599),
						new Item("Roses", 2399)};
		
		//loops through all items and adds them to the cart
		for (int index = 0; index < items.length; index++)
	      {
	         Item nextItem = items[index]; // Simulate getting item from shopper
	         shoppingCart.add(nextItem);
	         totalCost = totalCost + nextItem.getPrice();  
	      } // end for
		
		System.out.println("The cart contains " + shoppingCart.getCurrentSize() +
                " items(s)");
		
		//removing item in index spot 1 (Wrench) from the cart and updates total
		shoppingCart.remove(items[1]);
		totalCost = totalCost - items[1].getPrice();
		
		//outputs updated cart size after removing item
		System.out.println("The cart contains " + shoppingCart.getCurrentSize() +
                " items(s)");
		
		shoppingCart.add(new Item("Umbrella", 799));
		
		
		//displays number of items in the cart
		System.out.println("The cart contains " + shoppingCart.getCurrentSize() +
                " items(s)");		
		
		totalCost = 0;
		shoppingCart.clear();
		//loops through all items and adds them to the cart
				for (int index = 0; index < items.length; index++)
			      {
			         Item nextItem = items[index]; // Simulate getting item from shopper
			         shoppingCart.add(nextItem);
			         totalCost = totalCost + nextItem.getPrice();  
			      } // end for
		
		//displays an item's name and price, and removes it from the cart until empty
		while (!shoppingCart.isEmpty())
	         System.out.println(shoppingCart.remove());	 
		
		//displays the combined total cost of all items in the cart
			System.out.println("Total cost: " + "\t$" + totalCost / 100 + "." +
	                         totalCost % 100);
			
		
	}//end main
}//end class