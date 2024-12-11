import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "Group1", 1, List.of(4, 5, 3)));
        students.add(new Student("Petr", "Group2", 2, List.of(2, 3, 2)));
        students.add(new Student("Anna", "Group3", 3, List.of(5, 5, 5)));
        students.add(new Student("Maria", "Group4", 1, List.of(3, 3, 3)));

        StudentManager.removeStudentsWithLowAverage(students);
        StudentManager.promoteStudents(students);

        System.out.println("Students on course 2:");
        StudentManager.printStudents(students, 2);
    }
}