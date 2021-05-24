package com.java.tutorial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//import java.util.stream.Collectors;

public class StreamSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits= new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		
		System.out.println("affichage avec l'ordre naturel");
       fruits.stream()
    		   .sorted(Comparator.naturalOrder()).forEach(System.out::println);

		System.out.println("affichage sans parametre");
		fruits.stream()
		   .sorted().forEach(System.out::println);
		 
		System.out.println("trier en utilisant l'ordre inverse");
	    fruits.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	    
	    //trier les employés en utilisant  les lambda expression   
		System.out.println("Trier les employés en utilisant");
	    StreamFilteringExample.getProducts()
	       .stream().sorted((o1,o2)-> (int)(o1.getPrice()-o2.getPrice()))
	       .forEach(System.out::println);
	       
	    //trier les employés en utilisant les interfaces comparator 
		System.out.println("Trier les employés en fonction du prix");
	    StreamFilteringExample.getProducts().stream()
	    .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
	    .forEachOrdered(System.out::println);
	    
	  //trier les employés en utilisant les interfaces comparator 
	  		System.out.println("Trier les produits en fonction de leurs nom");
	  	    StreamFilteringExample.getProducts().stream()
	  	    .sorted(Comparator.comparing(Product::getName))
	  	    .forEachOrdered(System.out::println);
	       
	}

}
