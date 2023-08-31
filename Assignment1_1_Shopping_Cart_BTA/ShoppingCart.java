
public class ShoppingCart<T>
{
	int totalPrice;
	int itemCount;
	Item[] cart;
	int capacity;
	int storedItem;
	private int numberOfEntries;
	private boolean integrityOK = false;
	
	public ShoppingCart(int capacity)
	{
		cart = new Item[capacity];
		integrityOK = true;
	} // end constructor
	
	public ShoppingCart()
	{
		cart = new Item[5];
	}
	
	public boolean isEmpty()
	{
      return numberOfEntries == 0;
	} // end isEmpty
	
	public void addItem(Item input)
	{
		if(storedItem < cart.length)
		{
			cart[storedItem] = input;
			storedItem++;
		}
		else System.out.println("The shopping cart is full");
	}
	
	public Item removeItem()
	{
		checkintegrity();
		Item result = removeEntry(numberOfEntries - 1);
	      return result;
	}
	
	public boolean remove(Item anEntry)
	{
		checkintegrity();
      int index = getIndexOf(anEntry);
      Item result = removeEntry(index);
      return anEntry.equals(result);
	} // end remove
	
	private Item removeEntry(int givenIndex)
	{
		Item result = null;
      
		if (!isEmpty() && (givenIndex >= 0))
		{
         result = cart[givenIndex];          // Entry to remove
         int lastIndex = numberOfEntries - 1;
         cart[givenIndex] = cart[lastIndex];  // Replace entry to remove with last entry
         cart[lastIndex] = null;             // Remove reference to last entry
         numberOfEntries--;
		} // end if
      
      return result;
	} // end removeEntry
	
	public String getTotalCost()
	{
		for(int i = 0; i < cart.length; i++)
		{
			if(cart[i] != null)
			totalPrice = totalPrice + cart[i].getPrice();
		}
		return "$" + totalPrice/100 + "." + totalPrice%100;	
	}
	
	public int countItems()
	{
		itemCount = 0;
		for(int i = 0; i < cart.length; i++)
		{
			if(cart[i] != null)
			itemCount++;
		} 	
		return itemCount;
	}
	
	public void cartContents()
	{
		for(int i = 0; i < cart.length; i++)
		{
			if(cart[i] != null)
			System.out.println(cart[i]);
	}}
	
	private int getIndexOf(Item anEntry)
	{
		int where = -1;
		boolean found = false;
		int index = 0;
      
      while (!found && (index < numberOfEntries))
		{
			if (anEntry.equals(cart[index]))
			{
				found = true;
				where = index;
			} // end if
         index++;
		} // end while
	
	// Assertion: If where > -1, anEntry is in the array bag, and it
    // equals bag[where]; otherwise, anEntry is not in the array.
    
		return where;
	} // end getIndexOf
	
	   // Throws an exception if receiving object is not initialized.
	   private void checkintegrity()
	   {
	      if (!integrityOK)
	         throw new SecurityException ("ArrayBag object is corrupt.");
	   } // end checkintegrity
	
	
}//end ShoppingCart