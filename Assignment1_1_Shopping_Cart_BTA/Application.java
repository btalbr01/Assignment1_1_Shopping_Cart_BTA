
public class Application {

	public static void main(String[] args) {
		Item pen = new Item("Pen", 199);
		Item potatoes = new Item("Potatoes", 599);
		Item wrench = new Item("Wrench", 899);
		Item book = new Item("Book", 1899);
		
		ShoppingCart cart = new ShoppingCart(5);
		
		
		
		cart.addItem(pen);
		cart.addItem(potatoes);
		cart.addItem(book);
		cart.addItem(wrench);
		
		cart.countItems();
		cart.removeItem();
		cart.countItems();
		
		Item pillow = new Item("Pillow", 795);
		cart.addItem(pillow);
		cart.countItems();
		cart.remove(pillow);
		cart.countItems();
		
		cart.toArray();
		
		cart.removeItem();
		
		cart.toArray();
		
	}//end main
}//end class