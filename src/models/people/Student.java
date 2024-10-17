package models.people;

import models.interfaces.Gradable;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements Gradable {
    private List<Integer> grades;
    private static int totalStudents = 0;

    public Student(String name, int age) {
        super(name, age);
        this.grades = new ArrayList<>();
        totalStudents++;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + name + ", Age: " + age);
    }

    @Override
    public void assignGrade(int grade) {
        if (grade >= 0 && grade <= 5) {
            grades.add(grade);
            System.out.println("Grade " + grade + " has been assigned to " + name);
        } else {
            System.out.println("Invalid grade value.");
        }
    }

    @Override
    public String getGradeReport() {
        return "Grades of " + name + ": " + grades.toString();
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}