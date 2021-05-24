package com.java.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {

	public static void main(String[] args) {
		
		// create Stream of object
		System.out.println("Create Stream of Object\n");
		Stream<String> stream= Stream.of("Saliou","Fatimatou","Mahdiyou","Kolon");
	    stream.forEach(System.out::println);
	     
     // Create Stream from Objects from Collection
		System.out.println(" \n\nCreate Stream Object from collection\n");
	    Collection<String> collection=Arrays.asList("Saliou","Fatimatou","Mahdiyou","Kolon");
	    Stream<String> stream2=collection.stream();
	    stream2.forEach(System.out::println);
	    
	    //Create Stream Object from Collection
	    System.out.println("\n\nCreate Stream Object from List");
	    List<String> list= Arrays.asList("Modou","Fatou","Saliou","Samba");
	    Stream<String> stream3=list.stream();
	    stream3.forEach(System.out::println);
	    
	    //Create Stream Object from Set
	    System.out.println("\n Create Stream from Set");
	    Set<String> set= new HashSet<>(list);
	    Stream<String> stream4= set.stream();
	    stream4.forEach(System.out::println);
	    
	    //Create Stream Object from Arrays
	    System.out.println("\nCreate Stream Object from Arrays");
	    ArrayList<String> array= new ArrayList<>(list);
	    Stream<String> stream5= array.stream();
	    stream5.forEach(System.out::println);
	    
	    //Create Stream from Array of String
	    System.out.println("\n Create Stream from Array of String");
	    String[] strArray= {"Saliou","Fatimatou","Mahdiyou","Kolon"};
	    Stream<String> stream6=Arrays.stream(strArray);
	    stream6.forEach(System.out::println);
	    
	     
	}

}