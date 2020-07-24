package com.java.feature.functionalinterfaces;

import java.util.function.UnaryOperator;

//Unary operator used when user has same type of input and output it extends Function interface. 
public class UnaryOpratorExample {
	
	static UnaryOperator<String> unaryOperator = (s) -> s.concat("Default");
	
	public static void main(String[] args) {
		System.out.println("Result: "+unaryOperator.apply("Java8"));
	}

}
