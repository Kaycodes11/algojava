package oop;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] rollNo = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students (name, rollNo, marks)
        int[] rNo = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student john; // this is just declaration
        // System.out.println(john);
    }

    class Student {
        int rNo;
        String name;
        float marks;
    }
}


