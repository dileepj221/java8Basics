package com.java.feature.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p = (i) -> {
		return i % 2 == 0;
	};

	static Predicate<Integer> p1 = (i) -> i % 2 == 0;

	static Predicate<Integer> p2 = (i) -> i % 5 == 0;

	public static void printAll() {
		System.out.println(p.test(4));
		System.out.println(p1.test(4));
	}

	public static void predicateAnd() {

		System.out.println("Predicate And result is : " + p1.and(p2).test(10)); // predicate chaining
		System.out.println("Predicate And result is : " + p1.and(p2).test(9)); // predicate chaining

	}

	public static void predicateOr() {

		System.out.println("Predicate OR result is : " + p1.or(p2).test(10)); // predicate chaining
		System.out.println("Predicate OR result is : " + p1.or(p2).test(8)); // predicate chaining

	}

	// Negate method give result in opposite form.
	public static void predicateNegate() {

		System.out.println("Predicate Negate result is : " + p1.or(p2).negate().test(8)); // predicate chaining

	}
}
