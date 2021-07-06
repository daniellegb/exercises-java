package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("João");
		list.add("Joe");
		
		list.add(2, "Caio");
		
		System.out.println(list.size());
		
		for(String x : list) {
			System.out.println(x);
		}
		
		//list.remove(0);
		
		list.removeIf(x -> x.charAt(0) == 'J');
		
		//list.remove("Caio");
		
		System.out.println("-------------------------");
		
		for(String x : list) {
			System.out.println(x);
		}

		System.out.println("Index of Caio: " + list.indexOf("Caio"));
		System.out.println("Index of Caio: " + list.indexOf("Jonas"));
		
		System.out.println("-------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'C')
				.collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst()
				.orElse(null);
		System.out.println(name);
		name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst()
				.orElse(null);
		System.out.println(name);

	}

}
