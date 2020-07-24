package com.java.feature.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> function = (name) -> name.toUpperCase();

    static Function<String,String> addSomeString = (name) -> name.toUpperCase().concat("default");
    
    //These lambda expression can be used in any class with extension.
    
    public static void printResult() {
    	//will return string in upper case
    	System.out.println("Result is : " + function.apply("java8"));
    	//will call 1st lambda implementation and then 2nd.
        System.out.println("Result of andthen is : " + function.andThen(addSomeString).apply("java8"));
        //will call 1st lambda then 2nd and then apply implementation of 1st lambda or compose with 1st lambda
        System.out.println("Result of andthen with Compose is: " + function.compose(addSomeString).apply("java8"));
    }
    
    public static String printFunctionalExample1() {
    	return FunctionalExample1.performConcat("hello");
    }


}

class FunctionalExample1{
	
	public static String performConcat(String str) {

        return FunctionExample.addSomeString.apply(str);
    }
}
