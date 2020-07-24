package com.java.feature.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

//takes 2 input and produces 1 output
public class BinaruOperator {
	
	static BinaryOperator<Integer> multiply = (a, b) -> a*b;
	
	static Comparator<Integer> compare = (a, b) -> a.compareTo(b);
	static BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(compare);

	
	public static void main(String[] args) {
		System.out.println(multiply.apply(3, 4));
	}

}
