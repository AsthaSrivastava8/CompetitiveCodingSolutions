package tmp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// product class to store records from DB
class Product {

	String productName, price;
	HashMap<String, String> cardDetails = new HashMap<String, String>();

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public HashMap<String, String> getCardDetails() {
		return cardDetails;
	}

	public void setCardDetails(HashMap<String, String> cardDetails) {
		this.cardDetails = cardDetails;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}

public class SearchAlgorithm {

	public static void main(String[] args) {

		
		// creating mock data
		List<Product> productsList = new ArrayList<Product>();
		HashMap<String, String> bankDiscounts = new HashMap<String, String>();

		Product product = new Product();

		product.setProductName("Fruity");
		product.setPrice("10");

		bankDiscounts.put("CITI", "10");

		bankDiscounts.put("HDFC", "50");

		bankDiscounts.put("DBS", "20");

		product.setCardDetails(bankDiscounts);

		productsList.add(product);

		HashMap<String, String> bankDiscounts1 = new HashMap<String, String>();

		Product product2 = new Product();
		product2.setProductName("Chips");
		product2.setPrice("20");

		bankDiscounts1.put("CITI", "5");

		bankDiscounts1.put("HDFC", "10");

		bankDiscounts1.put("DBS", "12");

		product2.setCardDetails(bankDiscounts1);

		productsList.add(product2);

		HashMap<String, String> bankDiscounts3 = new HashMap<String, String>();
		Product product3 = new Product();
		product3.setProductName("Bag");
		product3.setPrice("1000");

		bankDiscounts3.put("CITI", "50");

		bankDiscounts3.put("HDFC", "30");

		bankDiscounts3.put("DBS", "20");

		product3.setCardDetails(bankDiscounts3);

		productsList.add(product3);

		HashMap<String, String> bankDiscounts4 = new HashMap<String, String>();
		Product product4 = new Product();
		product4.setProductName("Mobile");
		product4.setPrice("5000");

		bankDiscounts4.put("CITI", "10");

		bankDiscounts4.put("HDFC", "50");

		bankDiscounts4.put("DBS", "20");

		product4.setCardDetails(bankDiscounts4);

		productsList.add(product4);
		HashMap<String, String> bankDiscounts5 = new HashMap<String, String>();
		Product product5 = new Product();

		product5.setProductName("Laptop");
		product5.setPrice("60000");

		bankDiscounts5.put("CITI", "80");

		bankDiscounts5.put("HDFC", "60");

		bankDiscounts5.put("DBS", "10");

		product5.setCardDetails(bankDiscounts5);

		productsList.add(product5);

		float minPrice = 0;
		float originalPrice = 0;
		String bestCard = null;

		Scanner sc = new Scanner(System.in);

		String productEntered = sc.nextLine();
		boolean flag = false;
		for (Product value : productsList) {

			// entering loop if required product found
			if (value.getProductName().equals(productEntered)) {

				minPrice = Float.parseFloat(value.getPrice());
				originalPrice = minPrice;

				HashMap<String, String> temp = new HashMap<String, String>();

				temp = value.getCardDetails();

				Iterator<HashMap.Entry<String, String>> itr = temp.entrySet().iterator();

				// iterating thorugh all the cards to find the maximum discount
				while (itr.hasNext()) {

					HashMap.Entry<String, String> entry = itr.next();
					float tempPrice = Float.parseFloat(entry.getValue());
					tempPrice /= 100;

					if (minPrice > (Float.parseFloat(value.getPrice())
							- Float.parseFloat(value.getPrice()) * tempPrice)) {

						minPrice = (Float.parseFloat(value.getPrice())
								- Float.parseFloat(value.getPrice()) * tempPrice);

						bestCard = entry.getKey();

					}

				}
				flag = true; // if product found
				break;

			}

		}
		if (flag) {
			System.out.println("Best bank: " + bestCard);
			System.out.println("Total savings: " + (originalPrice - minPrice));

		} else
			System.out.println("Product not found.");

	}

}
