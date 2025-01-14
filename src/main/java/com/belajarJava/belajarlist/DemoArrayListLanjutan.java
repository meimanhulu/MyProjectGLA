package com.belajarJava.belajarlist;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayListLanjutan {
    public static void main(String[] args) {
        ArrayList<String> anotherStudents = new ArrayList<String>();
        anotherStudents.add("Budi");
        anotherStudents.add("Andi");
        anotherStudents.add("Santi");

        ArrayList<String> students = new ArrayList<String>();
        students.addAll(anotherStudents);
        System.out.println(students.isEmpty());
        System.out.println(students);
        // contains
        System.out.println(students.contains("andi"));
        // toArray
        String[] samples = students.toArray(new String[0]);
        System.out.println(samples[0]);
        System.out.println(samples[1]);
        System.out.println(samples[2]);

        ArrayList<String> stm = new ArrayList<String>();
        stm.add("Budi");
        stm.add("Santi");

        System.out.println(students.removeAll(stm));
        System.out.println(students);
//        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 5));
//        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(2, 4, 6));
//
//        System.out.println("list1 containsAll list2: " + list1.containsAll(list2)); // Output: true
//        System.out.println("list1 containsAll list3: " + list1.containsAll(list3)); // Output: false
    }
}