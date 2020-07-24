package com.java.feature.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.java.feature.data.Student;
import com.java.feature.data.StudentData;

//It takes 2 input and produce 1 output.
public class BiFunctionExample {
	
	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = ((students, studentPredicate) -> {
		
		Map<String, Double> studentMap = new HashMap<>();
		
		students.forEach(student -> {
			if(studentPredicate.test(student)) {
				studentMap.put(student.getName(), student.getGpa());
			}
		});
		
		return studentMap;
		
	});
	
	public static void main(String[] args) {
		System.out.println("Student Grade: " + biFunction.apply(StudentData.getAllStudents(), PredicateWithStudent.p2));
	}

}
