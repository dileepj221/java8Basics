package com.java.feature.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.java.feature.data.Student;
import com.java.feature.data.StudentData;

public class FunctionStudent {
	
	static Function<List<Student>, Map<String, Double>> studentGrade = (students -> {
		Map<String, Double> studentGradeMap = new HashMap<>();
		
		students.forEach((student -> {
			if(PredicateWithStudent.p1.test(student)) {
				studentGradeMap.put(student.getName(), student.getGpa());	
			}
		}));
		
		return studentGradeMap;
	});
	
	public static void main(String[] args) {
		System.out.println(studentGrade.apply(StudentData.getAllStudents()));
	}

}
