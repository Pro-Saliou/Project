package com.java.tutorial;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFindElementExample {

	public static void main(String[] args) {
		
	    List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	    Stream <Integer> stream= Stream.of(1,2,3,4,5,6,7,8,9,10);
	    Stream <Integer> stream1= Stream.of(1,2,3,4,5,6,7,8,9,10);
	    Stream <Integer> stream2= Stream.of(1,2,3,4,5,6,7,8,9,10);


	    
  // Trouver le premier element dans la list
	    Optional<Integer> element=list.stream().findFirst();	 
	    if(element.isPresent()) {
	    	System.out.println(element.get());
	    }
	    else  {
	    	System.out.println("La liste est vide");
	    }

  // trouver un element dans la list
	    Optional<Integer> element1=list.stream().findAny(); 
	    if(element1.isPresent()) {
	    	System.out.println(element1.get());

	    }
	    else  {
	    	System.out.println("La liste est vide");

	    }
	    
	    // afficher le nombre d'élement dans un Stream
	    System.out.println(" Le nombre d'elements est:"+stream.count());
	    
	    // Afficher  l'element  le plus grand
	    System.out.println("L'element le plus grand est:"+ stream1.max(Comparator.comparing(Integer::valueOf)).get());
      
	    // Afficher  l'element  le plus grand
	    System.out.println("L'element le plus grand est:"+ stream2.min(Comparator.comparing(Integer::valueOf)).get());
	    
	}

}
