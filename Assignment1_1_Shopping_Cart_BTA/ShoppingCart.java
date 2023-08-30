import java.util.*;
public class ShoppingCart {

	public static void main(String[] args) {
		int totalCost = 0;
		ArrayBag<String> items = new ArrayBag<String>(10); //initializes a bag to hold 10 items
		//checks if the cart is empty
		if(items.isEmpty())
			System.out.println("The cart is empty");
		else System.out.println("The cart is not empty");
		
		//adding items and their prices to the cart
		ArrayBag[] cart = {new ArrayBag("Potatoes", 599),
						   new ArrayBag("Wrench", 1299),
						   new ArrayBag("Vacuum", 5599),
						   new ArrayBag("Jeans", 2299),
						   new ArrayBag("Roses", 2399)};
		
		for (int index = 0; index < cart.length; index++)
	      {
	         ArrayBag nextItem = cart[index]; // Simulate getting item from shopper
	         items.add(nextItem);
	         totalCost = totalCost + nextItem.getPrice();  
	      } // end for
		//testing that items were added correctly
		/*System.out.println("The cart contains " + items.getCurrentSize() +
                " items(s), as follows:");		
		Object[] itemArray = items.toArray();
		for (int index = 0; index < itemArray.length; index++)
		{
			System.out.print(itemArray[index] + "\n");
		} // end for	
		System.out.println();*/
		
		//adding additional items to the bag
		items.add("Gum", 199);
		totalCost = totalCost + items.getPrice();
		items.add("Potatoes", 599);
		totalCost = totalCost + items.getPrice();
		items.add("Eggs", 299);
		totalCost = totalCost + items.getPrice();
		items.add("Sandals", 1399);
		totalCost = totalCost + items.getPrice();
		items.add("Screwdriver", 899);
		totalCost = totalCost + items.getPrice();
		
		//updating the item list
		itemArray = items.toArray();
		
		//displaying the most recently added items in the bag
		System.out.println("Items added to the cart:");
		for (int index = 5; index < itemArray.length; index++)
		{
			System.out.print(itemArray[index] + "\n");
		} // end for	
		System.out.println();
		
		//displaying all items in the updated bag
		System.out.println("The cart contains:");
		for (int index = 0; index < itemArray.length; index++)
		{
			System.out.print(itemArray[index] + "\n");
		} // end for	
		
		System.out.println("There are " + items.getFrequencyOf("Potatoes") + " instances of Potatoes in the cart");
		System.out.println("$" + totalCost/100 + "." + totalCost%100);
	}//end main
}//end class