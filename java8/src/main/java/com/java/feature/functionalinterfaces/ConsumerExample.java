package com.java.feature.functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.java.feature.data.Student;
import com.java.feature.data.StudentData;

public class ConsumerExample {

	//code re-usability
	static Consumer<Student> c2 = (student) -> System.out.println(student);
	static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
	static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

	public static void printStudents() {

		List<Student> studentList = StudentData.getAllStudents();
		studentList.forEach(c2);
	}

	public static void printNameAndActivities() {
		System.out.println("printNameAndActivities :");

		List<Student> studentList = StudentData.getAllStudents();

		studentList.forEach(c3.andThen(c4)); //Consumer chaining as c4 will only executes
	}

	public static void printNameAndActivitiesUsingCondition() {

		System.out.println("printNameAndActivitiesUsingCondition :");
		List<Student> studentList = StudentData.getAllStudents();

		studentList.forEach((student -> {
			if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
				c3.andThen(c4).andThen(c2).accept(student);
			}
		}));
	}

}
