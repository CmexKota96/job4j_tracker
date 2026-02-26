package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Yakovlev Evgenii Yrevich");
        student.setGroup("РИ-140004");
        student.setCreated(2014, 9, 1);
        System.out.println(student.getFio() + " has a group - " + student.getGroup()
                + " enrolled in training - " + student.getCreated());
    }
}
