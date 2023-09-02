/*
 * A class that holds item names and prices
 * @author Ben Albright
 */
public class Item 
{
	private String product; //Holds an item's name
	private int price; //holds an item's price
	
	//Gets an item's name and price passed in from the Application class
		public Item(String productName, int productPrice)
		{
			product = productName;
			price = productPrice;
		}//end preferred constructor

		//Returns the name of an item
		public String getProduct() 
		{
			return product;
		}//end getProduct

		//@param product Gets the name of the item
		public void setProduct(String product) 
		{
			this.product = product;
		}//end setProduct

		//returns the price of an item
		public int getPrice() 
		{
			return price;
		}//end getPrice

		//@param price  Gets the price of an item
		public void setPrice(int price) 
		{
			this.price = price;
		}//end setPrice

		//Returns the item's name and price
		@Override
		public String toString() {
			return product + "\t" + "$" + price/100 + "." + price%100;
		}//end toString		
}//end Item