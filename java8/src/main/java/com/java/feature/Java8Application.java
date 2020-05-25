package com.java.feature;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.feature.data.Student;
import com.java.feature.data.StudentData;
import com.java.feature.functionalinterfaces.ConsumerExample;
import com.java.feature.functionalinterfaces.PredicateAndConsumerExample;
import com.java.feature.functionalinterfaces.PredicateExample;
import com.java.feature.functionalinterfaces.PredicateWithStudent;

@SpringBootApplication
public class Java8Application {

	public static void main(String[] args) {
		SpringApplication.run(Java8Application.class, args);
		
		//ConsumerExample from foreach loop
		System.out.println("Consumer Results");
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		c1.accept("java8");
		// printStudents();
		ConsumerExample.printNameAndActivities();
		ConsumerExample.printNameAndActivitiesUsingCondition();
		
		//Predicate test
		System.out.println("Predicate Results");
		PredicateExample.printAll();
        PredicateExample.predicateAnd();
        PredicateExample.predicateOr();
        PredicateExample.predicateNegate();
        
        //Predicate with Student object
        System.out.println("Predicate with Student result");
        PredicateWithStudent.filterStudentsByGradeLevel();
        PredicateWithStudent.filterStudentsByGpa();
        PredicateWithStudent.filterStudents();
        
        //Predicate/BiPredicate and Consumer example
        System.out.println("Predicate/BiPredicate and Consumer example");
        List<Student> studentList = StudentData.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList); //Calling after constructor initialization as it is not a static method.
	}

}
