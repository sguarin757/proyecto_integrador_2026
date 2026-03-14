package co.edu.cesde.ga.app;
import models.Person;
import models.Teacher;
import models.Student;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("T001", "123456789", "John", "Doe", true, 1L);
        Student student = new Student("S001", "987654321", "Jane", "Smith", true, null, 1L);

        System.out.println(teacher);
        System.out.println(student);

 
    }
}
