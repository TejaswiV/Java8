package com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java8.streams.helper.Person;

public class PersonStreamCollector {

	public static void main(String[] args) {

		Person peter = new Person("Peter", 12);
		Person max = new Person("Max", 22);
		Person mark = new Person("Mark", 35);
		Person wendy = new Person("Mark", 42);
		Person alex = new Person("Alex", 42);
		Person jess = new Person("Jess", 24);
		Person george = new Person("George", 23);
		Person louise = new Person("Eva", 43);
		Person rachel = new Person("Rachel", 25);
		Person zain = new Person("Zain", 30);
		Person steve = new Person("Steve", 26);
		Person smith = new Person("Smith", 12);
		Person david = new Person("David", 40);
		Person diana = new Person("Diana", 22);
		Person eliz = new Person("Eliz", 19);
		Person reni = new Person("Reni", 17);
		Person eva = new Person("Eva", 44);
		Person josh = new Person("Josh", 36);
		
		List<Person> list = new ArrayList<>();
		list.add(peter); list.add(max); list.add(mark); list.add(wendy); list.add(alex);
		list.add(jess); list.add(george); list.add(louise); list.add(rachel); list.add(zain);
		list.add(steve); list.add(smith); list.add(david); list.add(diana); list.add(eliz);
		list.add(reni); list.add(eva); list.add(josh);
		
		List<Person> ageMoreThan30 = list.stream()
										.filter(p -> p.getAge() > 30)
										.collect(Collectors.toList());
		System.out.println(ageMoreThan30);	
		
		List<Person> ageMoreThan30AL = list.stream()
										.filter(p -> p.getAge() > 30)
										.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(ageMoreThan30AL);
		
		
		Map<Integer, List<Person>> byAge = list.stream()
												.collect(Collectors.groupingBy(Person::getAge));
		System.out.println(byAge);
		
		Map<Integer, Long> byAgeCount = list.stream()
				.collect(Collectors.groupingBy(Person::getAge,Collectors.counting()));
		System.out.println(byAgeCount);
		
		
		Map<Integer, List<String>> byAgeName = list.stream()
				.collect(
						Collectors.groupingBy(
							Person::getAge,
							Collectors.mapping(
								Person::getName, Collectors.toList()
							)
						)
				);
		System.out.println(byAgeName);
		
		// partition by age
		Map<Boolean, List<Person>> byPartition = list.stream()
													.collect(Collectors.partitioningBy(p -> p.getAge() > 30));
		System.out.println(byPartition);
				
		// summing		
		Map<String, Long> sumAgesByName = list.stream()
											.filter(p -> p.getAge() > 30)
											.collect(
													Collectors.groupingBy(
															Person::getName, 
															Collectors.summingLong(Person::getAge)
													)
											);
		
		System.out.println(sumAgesByName);
		
		// averaging		
		Map<String, Double> avgAgesByName = list.stream()
												.filter(p -> p.getName().startsWith("M"))
												.collect(
														Collectors.groupingBy(
																Person::getName, 
																Collectors.averagingInt(Person::getAge)
																)
														);
		
		System.out.println(avgAgesByName);
		
		
		
		// Joining
		
		String joinedNames = list.stream()
								.filter(p -> p.getAge() > 30)
								.map(p -> p.getName())
								.distinct()
								.collect(Collectors.joining(" , "));
		System.out.println(joinedNames);
		
		
		// maxBy() - to get Person object
		Optional<Person> oldestPerson = list.stream()
								.filter(p -> p.getAge() > 30)
								.collect(Collectors.maxBy(Comparator.comparing(Person::getAge)));
		oldestPerson.ifPresent(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
