package com.rushikesh.assistedproject;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		//list.add(780);
		
		list.add("Ram");
		list.add("Harni");
		list.add("Sham");
		list.add("Harni");
		
		//list.add(false);
		
		System.out.println("Size of list : " + list.size());
		
		list.add("Nikita");
		//list.add(56.90);
		
		System.out.println("Now size : " + list.size());
		
		
		System.out.println("Value at index 2 is : " + list.get(2));
		
		System.out.println("List : " + list);
		
		list.remove(1);
		
		System.out.println("After deleting one object, list size :" +  list.size());
		
		System.out.println("List now looks like : " + list);
		

		System.out.println("-------------------");
		
		System.out.println("Values in list : ");

		
		

	}

}
