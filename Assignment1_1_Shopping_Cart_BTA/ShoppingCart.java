
public class ShoppingCart<T>
{
	int totalPrice;
	int itemCount;
	String itemName;
	int itemCost;
	int quantity;
	BagInterface<Item> shoppingCart = new ArrayBag<Item>();
	private T[] bag; // Cannot be final due to doubling
	
	public ShoppingCart(int index, T value)
	{
		this.bag[index] = value;
	} // end constructor
	
	public ShoppingCart()
	{
		this.bag = (T[]) new Object[10];
	}
	
	public void addItem(ShoppingCart merch)
	{
		this.quantity = this.quantity + merch.quantity;
	}
	
	public void removeItem(ShoppingCart merch)
	{
		this.quantity = this.quantity - merch.quantity;
	}
	
	public int getTotalCost(int totalCost)
	{
		return totalCost;
	}
	
	public int countItems(int itemCount)
	{
		return itemCount;
	}
	
	
	
}//end ShoppingCart