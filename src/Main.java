import models.people.Student;
import models.people.Teacher;
import models.school.School;

public class Main {
    public static void main(String[] args) {
        School mySchool = new School("SimbirSoft");

        Student student1 = new Student("Yakubovich Denis", 15);
        Student student2 = new Student("Saigin Kirill", 16);
        Teacher teacher1 = new Teacher("Barsukov Evgeniy", 40, "Mathematics");
        Teacher teacher2 = new Teacher("Bagapov Arif", 35, "English");

        mySchool.addStudent(student1);
        mySchool.addStudent(student2);
        mySchool.addTeacher(teacher1);
        mySchool.addTeacher(teacher2);

        student1.assignGrade(4);
        student1.assignGrade(5);
        System.out.println(student1.getGradeReport());

        teacher1.teachSubject("Mathematics");

        mySchool.displaySchoolInfo();

        System.out.println("Total students created: " + Student.getTotalStudents());
        System.out.println("Total teachers created: " + Teacher.getTotalTeachers());
    }
}