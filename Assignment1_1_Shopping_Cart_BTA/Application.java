/*@author Ben Albright*/
//Github link: https://github.com/btalbr01/Assignment1_1_Shopping_Cart_BTA
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
		Item pizza = new Item("Pepperoni pizza", 975);
		Item soda = new Item("Coke", 489);
		Item corn = new Item("Corn", 79);
		
		//Instantiating a new shopping cart to hold items and call methods from the ArrayBag Class
		ShoppingCart cart = new ShoppingCart(5);
		
		
		//Counts the number of items currently in the cart
		cart.countItems();
				
		//Initial test to see if the cart is empty
		cart.isEmpty();
		
		//Adding 4 items to the shopping cart
		cart.addItem(pen);
		cart.addItem(potatoes);
		cart.addItem(book);
		cart.addItem(wrench);
		cart.addItem(pizza);
		cart.addItem(soda);
		cart.addItem(corn);
		
		//Rechecking to make sure items were added successfully
		cart.isEmpty();
		
		/*Counts the number of items currently in the cart, then displays 
		 * all items in the cart, their prices and the total price
		*/
		cart.countItems();
		
		//adding a return for readability 
		System.out.println(); 
		
		//Removes the last item in the cart. Wrench in this case
		cart.removeItem();
		
		/*Counts the number of items currently in the cart, then displays 
		 * all items in the cart, their prices and the total price
		*/
		cart.countItems();
		
		//adding a return for readability 
		System.out.println(); 
		
		//Instantiates the pillow item
		Item pillow = new Item("Pillow", 795);
		
		//Adds the pillow to the cart
		cart.addItem(pillow);
		
		//adding a return for readability 
		System.out.println(); 
		
		/*Counts the number of items currently in the cart, then displays 
		 * all items in the cart, their prices and the total price
		*/
		cart.countItems();
		
		//Removes a specific item (pillow) from the cart
		cart.remove(pillow);
		
		//adding a return for readability 
		System.out.println(); 
				
		/*Counts the number of items currently in the cart, then displays 
		 * all items in the cart, their prices and the total price
		*/
		cart.countItems();
		
		//adding a return for readability 
		System.out.println(); 
		
		//Removes the last item in the cart
		cart.removeItem();
		
		//Instantiating more items into the cart
		Item Doritos = new Item("Doritos", 329);
		Item water = new Item("Water", 362);
		Item turkey = new Item("Turkey", 450);
		Item guitar = new Item("Guitar", 51974);
		Item diamondRing = new Item("Diamond Ring", 1009999);
		Item milk = new Item("Milk", 371);
		
		//Adding new items to the cart
		cart.addItem(Doritos);
		cart.addItem(water);
		cart.addItem(diamondRing);
		
		//removing the expensive ring
		cart.remove(diamondRing);
		
		//adding more items
		cart.addItem(turkey);
		cart.addItem(guitar);
		cart.addItem(milk);
		
		//removing a specific item from the cart
		cart.remove(guitar);
		
		//removing several nonspecified items from the cart
		cart.removeItem();
		cart.removeItem();
		cart.removeItem();
		cart.removeItem();
		
		//removing another specific item from the cart
		cart.remove(wrench);
		
		//testing the getFrequency method by adding an additional pen object to the cart
		cart.getFrequencyOf(pen);
		cart.addItem(pen);
		cart.getFrequencyOf(pen);
		
		//testing the contains method
		cart.contains(pen); //returns true because it is in the cart
		cart.contains(pillow); //returns false because it had been removed
		
		//removing all items from the cart
		cart.clear();
	}//end main
}//end class