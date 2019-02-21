package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class LambdaWithCollections {

	public static void main(String[] args) {
		
		// Sorting list descending order with lambda expression
		List<Integer> l = new ArrayList<>();
		l.add(10); l.add(50); l.add(78);l.add(3); l.add(8);		
		System.out.println("Before Sorting list "+l);		
		
		Collections.sort(l, (l1,l2) -> (l1 > l2)? -1 : (l1<l2) ? 1 : 0);
		System.out.println("After soritng list "+l);
		
		// Sorting Set descending order with lambda expression
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(12); set.add(34); set.add(10); set.add(56);set.add(9);
		System.out.println("Treeset Natural ordering " +set);
		
		TreeSet<Integer> set2 = new TreeSet<Integer>((t1,t2) -> (t1 > t2)? -1 : (t1 < t2) ? 1 : 0);
		set2.add(12); set2.add(34); set2.add(10); set2.add(56);set2.add(9);
		System.out.println("Treeset custom oredering with Lambda "+set2);
		
		
		//Sorting Map with Lambda Expression
		Map<String, Integer> map = new TreeMap<String, Integer>((k1, k2) -> (k1.compareTo(k2) > 0) ? -1 : (k1.compareTo(k2) < 0) ? 1 : 0);
		map.put("Foo", 123); map.put("Bar", 345); map.put("Jazz",56); map.put("Hello", 78);
		System.out.println("Map after sorting with Lambda "+map);
		
	}
	
	
}
