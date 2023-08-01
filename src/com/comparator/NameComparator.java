package com.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student std1, Student std2) {

        return std1.name.compareTo(std2.name);
    }
}
