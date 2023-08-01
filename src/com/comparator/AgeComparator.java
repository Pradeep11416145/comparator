package com.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {


    @Override
    public int compare(Student std1, Student std2) {
        if(std1.age==std2.age){
            return 0;
        }else if(std1.age>std2.age){
            return 1;
        }else {
            return -1;
        }

    }
}



