package com.java.feature.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java.feature.data.Student;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
    
    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    BiConsumer<String,List<String>> studentBiConsumer = (name,activities) -> System.out.println(name + " : " + activities);


    Consumer<Student> studentConsumer =(student -> {
    	// uncomment below test only Predicate with Consumer
		/*
		 * if(p1.and(p2).test(student)){
		 * studentBiConsumer.accept(student.getName(),student.getActivities()); }
		 */
    	
    	//Below is used to test BiPredicate
    	if(biPredicate.test(student.getGradeLevel(), student.getGpa())) {
    		studentBiConsumer.accept(student.getName(), student.getActivities());
    	}
    });


    public void printNameAndActivities(List<Student> students){

        students.forEach(studentConsumer);
    }

}
