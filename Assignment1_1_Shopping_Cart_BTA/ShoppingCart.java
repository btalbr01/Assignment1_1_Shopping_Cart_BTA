
public class ShoppingCart<T>
{
	private int totalPrice;
	private ArrayBag<Item> cart;
	private int capacity;
	private Item[] item;
    
	private static final int DEFAULT_CAPACITY = 25; // Initial capacity of bag
	
	public ShoppingCart(int capacity)
	{
		cart = new ArrayBag<Item>();
		this.capacity = capacity;
	} // end constructor
	
	public ShoppingCart()
	{
		this(DEFAULT_CAPACITY);
	}
	
	public void isEmpty()
	{
      System.out.println(cart.isEmpty());
	} // end isEmpty
	
	public void addItem(Item input)
	{
		cart.add(input);
	}
	
	public void	 removeItem()
	{
		cart.remove();
	}
	
	public void remove(Item anEntry)
	{
		cart.remove(anEntry);
	} // end remove
	
	public String getTotalCost()
	{
		totalPrice = 0;
		while(!cart.isEmpty());
		{
		cart.remove();
		}
		
		return "Total cost is: $" + 3;
	}
	
	public void countItems()
	{
		System.out.println(cart.getCurrentSize());
	}
	
	public void getCurrentSize()
	{
		cart.getCurrentSize();
	}
	
	public void toArray()
	{
		totalPrice = 0;
		int x = 0;
		Object[] itemArray = cart.toArray();
		
		for(Object i: itemArray) {
			System.out.println(i);
			totalPrice = totalPrice + ((Item) itemArray[x]).getPrice();
			x++;
		}
		System.out.println("Total price is: $" + totalPrice/100 + "." + totalPrice%100);
	}

}//end ShoppingCart