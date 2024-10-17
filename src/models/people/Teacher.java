package models.people;

import models.interfaces.Teachable;

public class Teacher extends Person implements Teachable {
    private String subject;
    private static int totalTeachers = 0;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        totalTeachers++;
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher: " + name + ", Age: " + age + ", Subject: " + subject);
    }

    @Override
    public void teachSubject(String subject) {
        System.out.println("Teacher " + name + " is teaching " + subject);
    }

    public String getSubject() {
        return subject;
    }

    public static int getTotalTeachers() {
        return totalTeachers;
    }
}