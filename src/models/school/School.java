package models.school;

import models.people.Student;
import models.people.Teacher;
import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> students;
    private List<Teacher> teachers;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " has been added to the school.");
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("Teacher " + teacher.getName() + " has joined the school.");
    }

    public void displaySchoolInfo() {
        System.out.println("School: " + name);
        System.out.println("Total Students: " + students.size());
        System.out.println("Total Teachers: " + teachers.size());
    }
}