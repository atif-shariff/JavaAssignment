package com.training.quest1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,List<String>> hashMap = new HashMap<>();
		
		List<String> KarnatakaCities = new ArrayList<>();
		KarnatakaCities.add("Bangalore");
		KarnatakaCities.add("Mysore");
		KarnatakaCities.add("Hubli");
		
		List<String> MaharashtraCities = new ArrayList<>();
		MaharashtraCities.add("Mumbai");
		MaharashtraCities.add("Pune");
		MaharashtraCities.add("Nagpur");
		
		List<String> KeralaCities = new ArrayList<>();
		KeralaCities.add("Thiruvananthapuram");
		KeralaCities.add("Kochi");
		KeralaCities.add("Kollam ");
		
		hashMap.put("Karnataka", KarnatakaCities);
		hashMap.put("Maharashtra", MaharashtraCities);
		hashMap.put("Kerala", KeralaCities);
		
		
//		System.out.println(hashMap);
//		
//		 List<String> citiesInKarnataka = hashMap.get("Karnataka");
//	     System.out.println("Cities in Karnataka: " + citiesInKarnataka);
//		
//		for(List<String> cities :hashMap.values()) {
//			System.out.println("cities "+cities);
//			
//		}
		
		System.out.println(hashMap.get("Karnataka"));
		
		Set<String> keys = hashMap.keySet();

        for (String key : keys) {

            System.out.println(key+" : "+hashMap.get(key));

        }
	}

}
