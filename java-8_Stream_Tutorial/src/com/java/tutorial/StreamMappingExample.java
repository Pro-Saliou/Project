package com.java.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMappingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String> liste= Arrays.asList("a","b","c","d");
	liste.stream().map(String::toUpperCase).forEach(System.out::println);
	
	System.out.println("affichage du carrée des valeurs");
	List<Integer> entier=Arrays.asList(1,2,3,4);
	entier.stream().map(x->2*x).forEach(System.out::println);

    List<User> users= new ArrayList<User>();
	users.add(new User(1,"Saliou","saliou@gmail.com","saliou"));
	users.add(new User(2,"Fatimatou","fatimatou@gmail.com","fatimatou"));
	users.add(new User(3,"Mahdiyou","mad@gmail.com","mahdiyou"));
	users.add(new User(4,"Ousmane","saliou@gmail.com","ousmane"));
	users.add(new User(5,"Moussa","moussa@gmail.com","moussa"));

   users.stream().map(user->new UserDto(user.getId(),user.getNom(),user.getLogin()))
   .forEach(System.out::println);

	}
	
	
	
}
