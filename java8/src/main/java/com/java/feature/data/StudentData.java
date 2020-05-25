package com.java.feature.data;

import java.util.Arrays;
import java.util.List;

public class StudentData {

    /**
     * @return
     */
    public static List<Student> getAllStudents(){

        Student student1 = new Student("Dileep",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
        Student student2 = new Student("Monika",2,3.8,"female", Arrays.asList("swimming", "gymnastics","soccer"));
        Student student3 = new Student("Manisha",3,4.0,"female", Arrays.asList("swimming", "gymnastics","aerobics"));
        Student student4 = new Student("Akshay",3,3.9,"male", Arrays.asList("swimming", "gymnastics","soccer"));
        Student student5 = new Student("Kavita",4,3.5,"female", Arrays.asList("swimming", "dancing","football"));
        Student student6 = new Student("Ram",4,3.9,"male", Arrays.asList("swimming", "basketball","baseball","football"));

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
        return students;
    }
}
