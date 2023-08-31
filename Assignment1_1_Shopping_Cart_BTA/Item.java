
public class Item 
{
	private String product;
	private int price;
		public Item(String productName, int productPrice)
		{
			product = productName;
			price = productPrice;
		}//end preferred constructor

		public String getProduct() {
			return product;
		}//end getProduct

		public void setProduct(String product) {
			this.product = product;
		}//end setProduct

		public int getPrice() {
			return price;
		}//end getPrice

		public void setPrice(int price) {
			this.price = price;
		}//end setPrice

		@Override
		public String toString() {
			return product + "\t" + "$" + price/100 + "." + price%100;
		}//end toString		
}//end Item