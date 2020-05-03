//This Class contains java8 features of looping
package com.bestpractising;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestPractisesofJv8 {

	public static void main(String[] args) {
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		// For each with lambda expressions
		items.forEach((k,v)->System.out.println("Item: "+k+" Count: "+v));
		
		//For each with lambda expression and filtering
		items.forEach((k,v)->{
			System.out.println("Item: "+k+" Count: "+v);
			if("F".equals(k)) {
				System.out.println("Hello E");
			}
		});
		
		List<String> items1 = new ArrayList<>();
		items1.add("A");
		items1.add("B");
		items1.add("C");
		items1.add("D");
		items1.add("E");
		
		//forEach with Lambda Expression in list
		items1.forEach(itemd->System.out.println("this is in List iteration: "+itemd));
		
		//Filtering wtih Lambda Expression
		items1.forEach(item->{
			if("D".equals(item)) {
				System.out.println("In Lamda Expression with Filtering: "+item);
			}
		});
		
		items1.forEach(System.out::println);
		
		items1.stream().filter(s->s.contains("C")).forEach(System.out::println);

	}

}
