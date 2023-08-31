
public class Application {

	public static void main(String[] args) {
		Item pen = new Item("Pen", 199);
		Item potatoes = new Item("Potatoes", 599);
		Item wrench = new Item("Wrench", 899);
		
		ShoppingCart cart = new ShoppingCart(5);
		
		cart.addItem(pen);
		cart.addItem(potatoes);
		cart.addItem(wrench);
		
		System.out.println("There are " + cart.countItems() + " items in the cart");
		
		cart.cartContents();
		System.out.println("Total cost is: " + cart.getTotalCost());
		
		cart.remove(pen);
		cart.cartContents();
		
		
	}//end main
}//end class