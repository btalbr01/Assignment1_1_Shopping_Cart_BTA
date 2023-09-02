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
		cart = new ArrayBag<Item>(); 
		this.capacity = capacity;
	} // end empy argument constructor
	
	public ShoppingCart()
	{
		this(DEFAULT_CAPACITY);
	}//end preferred constructor
	
	public boolean isEmpty()
	{
      return cart.isEmpty();
	} // end isEmpty
	
	//Adds an Item object to the bag - includes item name and price
	public void addItem(Item input)
	{
		cart.add(input);
	}//end addItem
	
	//Removes the last item in the bag
	public void	 removeItem()
	{
		cart.remove();
	}//end removeItem
	
	/*Removes a specific item from the bag
	 * @param anEntry  The specific Item object to be removed
	 */
	public void remove(Item anEntry)
	{
		cart.remove(anEntry);
	} // end remove

	//Calls the ArrayBag method to get the number of items in the cart
	public int countItems()
	{
		return cart.getCurrentSize();
	}//end countItems
	
	/*
	 * This method iterates through the array, outputting each item and its respective price.
	 * It also tabulates the total cost of all the items.
	 * The total cost is converted into USD
	 */
	public void toArray()
	{
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
		System.out.println("Total price is: $" + totalPrice/100 + "." + totalPrice%100);
	}//end toArray
}//end ShoppingCart