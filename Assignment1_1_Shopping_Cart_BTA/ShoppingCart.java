/*A class that implements the ArrayBag class and the Item class
 * @author Ben Albright
 */
public class ShoppingCart<T>
{
	private int totalPrice; //Holds the total price of all items
	private ArrayBag<Item> cart; //Instantaites an ArrayBag<Item> to call methods from the ArrayBag class
	private int capacity; //The initial size of the cart passed in from the Application class
	private Item[] item; //An array to call the Item class's methods
	private static final int DEFAULT_CAPACITY = 25; // Initial capacity of bag
	
	public ShoppingCart(int capacity)
	{
		System.out.println("Using the ShoppingCart method to instantiate "
				+ "a shopping cart of initial size " + capacity + ".");
		cart = new ArrayBag<Item>(); 
		this.capacity = capacity;
	} // end empy argument constructor
	
	public ShoppingCart()
	{
		this(DEFAULT_CAPACITY);
	}//end preferred constructor
	
	//Tests whether or not there are any objects in the cart
	public void isEmpty()
	{
		System.out.println("Testing the isEmpty method.");
		if(cart.isEmpty())
		{
			System.out.println("The cart is empty!\n");
		}
		else System.out.println("The cart is NOT empty!\n");
	} // end isEmpty
	
	//Adds an Item object to the bag - includes item name and price
	public void addItem(Item anEntry)
	{
		System.out.println("Testing the addItem method.");
		cart.add(anEntry);
		System.out.println("\n" + anEntry.getProduct() + " has been added to the cart.\n");
		countItems();
	}//end addItem
	
	//Removes the last item in the bag
	public void	removeItem()
	{
		System.out.println("Testing the removeItem method.");
		cart.remove();
		System.out.println("The last item added to the cart has been removed.\n");
		countItems();
		System.out.println();
	}//end removeItem
	
	/*Removes a specific item from the bag
	 * @param anEntry  The specific Item object to be removed
	 */
	public void remove(Item anEntry)
	{
		System.out.println("Testing the remove method to remove a specific object from the cart.");
		cart.remove(anEntry);
		System.out.println("\n" + anEntry.getProduct() + " has been removed from the cart.");
		System.out.println();
		countItems();
		System.out.println();
	} // end remove

	//Calls the ArrayBag method to get the number of items in the cart
	public void countItems()
	{
		System.out.println("Testing the countItems method.");
		System.out.println("There are " + cart.getCurrentSize() + " item(s) in the cart.\n");
		toArray();
	}//end countItems
	
	//Outputs how many times a given entry occurs in the cart
	//@param anEntry The entry to be counted 
	public void getFrequencyOf(Item anEntry)
	{
		System.out.println("Testing the getFrequency method.");
		System.out.println(anEntry.getProduct() + " is in the cart " + cart.getFrequencyOf(anEntry) + " times\n");
	}
	
	//Checks if a given item is in the cart
	//@param anEntry the item to be checked
	public void contains(Item anEntry)
	{
		System.out.println("Testing the contains method.");
		if(cart.contains(anEntry))
			System.out.println("The cart contains " + anEntry.getProduct() + "\n");
			else System.out.println("The cart does not contain " + anEntry.getProduct() + "\n");
	}
	
	//Removes all items from the cart
	public void clear()
	{
		System.out.println("Testing the clear method.");
		cart.clear();
		isEmpty();
	}
	
	/*
	 * This method iterates through the array, outputting each item and its respective price.
	 * It also tabulates the total cost of all the items.
	 * The total cost is converted into USD
	 */
	private void toArray()
	{
		System.out.println("Testing the toArray method.");
		totalPrice = 0;
		int x = 0;
		Object[] itemArray = cart.toArray(); //creates an object to iterate through the array
		
		for(Object i: itemArray) //Loops through all items and outputs them
		{
			System.out.println(i);
			//Calls the getPrice method from the Item class
			totalPrice = totalPrice + ((Item) itemArray[x]).getPrice(); 
			x++; //updates the position in the Item array
		}//end for
		//Outputs the total cost converted into dollars and sense
		System.out.println("Total price is: $" + totalPrice/100 + "." + totalPrice%100 + "\n");
	}//end toArray
}//end ShoppingCart