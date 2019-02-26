package com.java8.lambda.functionalInterfaces;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFuncInterfaces {

	public static void main(String[] args) {
		
		// Primitive versions of Predicate
		IntPredicate ip =  i -> i % 2 == 0;
		System.out.println(ip.test(10));		
		
		//Primitive versions of Function
		IntFunction<Integer> f1 = i -> i * i;
		System.out.println(f1.apply(4));
		
		ToIntFunction<String> f2 = s -> s.length();
		System.out.println(f2.applyAsInt("Tejaswi"));
		
		ToDoubleFunction<Integer> f3 = i -> i/2;
		System.out.println(f3.applyAsDouble(75));
		
		IntToDoubleFunction f4 = i -> i/2.0 ;
		System.out.println(f4.applyAsDouble(75));
		
		DoubleToIntFunction f5 = i -> (int) i/2;
		System.out.println(f5.applyAsInt(75d));
		
		// Primitive versions of Consumer
		IntConsumer c1 = i -> System.out.println(i * i);
		c1.accept(20);
		
		LongConsumer c2 = i -> System.out.println(i * i);
		c2.accept(20);
		
		DoubleConsumer c3 = i -> System.out.println(i * i);
		c3.accept(20);
		
		// BiConsumer - If one input is object and second is primitive
		ObjDoubleConsumer<Employee> oc1 = (employee, increment) -> {
			employee.setSalary(employee.getSalary()+ increment);
			System.out.println(employee.getSalary());
		};
		oc1.accept(new Employee(1, 2000.25), 200.72);
		
		//primitive versions of Supplier
		IntSupplier s1 = () -> (int)(Math.random() * 10);
		System.out.println(s1.getAsInt());
		
		
	}

}
