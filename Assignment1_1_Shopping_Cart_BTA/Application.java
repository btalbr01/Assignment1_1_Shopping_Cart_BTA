/*@author Ben Albright*/
public class Application {

	public static void main(String[] args) {
		/*
		 * Instantiating items for the Item constructor - 
		 * Each item has a name and price that will be formatted later
		 */
		Item pen = new Item("Pen", 199);
		Item potatoes = new Item("Potatoes", 599);
		Item wrench = new Item("Wrench", 899);
		Item book = new Item("Book", 1899);
		
		//Instantiating a new shopping cart to hold items and call methods from the ArrayBag Class
		ShoppingCart cart = new ShoppingCart(5);
		
		
		//Counts the number of items currently in the cart
		System.out.println("There are " + cart.countItems() + " items in the cart\n");
				
		//Initial test to see if the cart is empty
		if(cart.isEmpty())
		{
			System.out.println("The cart is empty!");
		}
		else System.out.println("The cart is NOT empty!");
		
		//adding a return for readability 
		System.out.println(); 
		
		//Adding 4 items to the shopping cart
		cart.addItem(pen);
		cart.addItem(potatoes);
		cart.addItem(book);
		cart.addItem(wrench);
		
		//Counts the number of items currently in the cart
		System.out.println("There are " + cart.countItems() + " items in the cart\n");
		
		//Displays updated cart contents and prices
		cart.toArray();
		
		//adding a return for readability 
		System.out.println(); 
		
		//Removes the last item in the cart. Wrench in this case
		cart.removeItem();
		
		//updated recount of the cart after the item was removed
		System.out.println("There are " + cart.countItems() + " items in the cart");
		
		//adding a return for readability 
		System.out.println(); 
		
		//Displays updated cart contents and prices
		cart.toArray(); 
		
		//Instantiates the pillow item
		Item pillow = new Item("Pillow", 795);
		
		//Adds the pillow to the cart
		cart.addItem(pillow);
		
		//adding a return for readability 
		System.out.println(); 
		
		//updated recount of the cart after the item was removed
		System.out.println("There are " + cart.countItems() + " items in the cart\n");
		
		//Displays updated cart contents and prices
		cart.toArray();
		
		//Removes a specific item (pillow) from the cart
		cart.remove(pillow);
		
		//adding a return for readability 
		System.out.println(); 
				
		//updated recount of the cart after the item was removed
		System.out.println("There are " + cart.countItems() + " items in the cart\n");
		cart.countItems();
		
		//Displays updated cart contents and prices
		cart.toArray();
		
		//adding a return for readability 
		System.out.println(); 
		
		//Removes the last item in the cart
		cart.removeItem();
		
		//Displays updated cart contents and prices
		cart.toArray();
		
	}//end main
}//end class