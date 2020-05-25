package com.java.feature.functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.java.feature.data.Student;
import com.java.feature.data.StudentData;

public class PredicateWithStudent {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;

    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;

    public static void filterStudentsByGradeLevel(){

        System.out.println("filterStudentsByGradeLevel :");

        List<Student> studentList = StudentData.getAllStudents();

        studentList.forEach((student -> {

            if(p1.test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentsByGpa(){

        System.out.println("filterStudentsByGpa :");
        List<Student> studentList = StudentData.getAllStudents();

        studentList.forEach((student -> {

            if(p2.test(student)){
                System.out.println(student);
            }
        }));
    }

    //This method will check on or condition for both predicate.
    public static void filterStudents(){

        System.out.println("filterStudents :");
        List<Student> studentList = StudentData.getAllStudents();

        studentList.forEach((student -> {
            if(p1.or(p2).negate().test(student)){ //If we use .negate() here and then say test(student), then it will always return opposite of the condition given here.
                System.out.println("If Condition");
            	System.out.println(student);
            }else{
            	System.out.println("else Condition");
                System.out.println(student);
            }
        }));
    }

}
