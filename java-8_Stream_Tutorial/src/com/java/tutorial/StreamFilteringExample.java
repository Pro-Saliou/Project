package com.java.tutorial;
import java.util.ArrayList;
import java.util.List;

public class StreamFilteringExample {

	public static void main(String[] args) {
		
		//Affichage avec les Stream
		getProducts()
				.stream().
				filter((product)->product.getPrice()>200)
				.forEach(System.out::println);
				
	}

	
	public static List<Product> getProducts() {
		
		List<Product> products= new ArrayList<Product>();
		products.add(new Product(1,"voiture1",100.0));
		products.add(new Product(2,"voiture2",200.0));
		products.add(new Product(3,"voiture3",300.0));
		products.add(new Product(4,"voiture4",400.0));
		products.add(new Product(5,"voiture4",500.0));
		return products;
		
	}
}
