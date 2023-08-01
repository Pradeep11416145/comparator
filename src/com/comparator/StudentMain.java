package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {


        Student student = new Student("pradeep", 14, 1);
        Student student1 = new Student("ram", 15, 2);
        Student student2 = new Student("ankit", 16, 3);
// creating list of student

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);

        System.out.println("Shorting  by Name");

        // using name comparator to short element
        Collections.sort(studentList,new NameComparator());

        // iterating  the element of list

        for(Student st:studentList){
            System.out.println(st.roll+" . "+st.name+",  "+st.age);
        }

        System.out.println("Shorting by Age");

        // using ageComparator to short teh element

        Collections.sort(studentList,new AgeComparator());

        // iterating the list

        for(Student std:studentList){
            System.out.println(std.roll+" . "+std.name+" , "+std.age);
        }

        System.out.println("shorting by ROLL");

        // using the roll comparator to short the element

        Collections.sort(studentList,new RollComparator());
        // iterating the list
        for(Student std:studentList){
            System.out.println(std.roll+" . "+std.age+" ," +std.name);
        }








    }

}
