package co.edu.cesde.ga.app;
import models.Person;
import models.Teacher;
import models.Student;

public class Main {
    public static void main(String[] args) {
        // crear 4 personas y mostrar su información y un profesor y un estudiante con constructores vacios y con constrictores llenos utilizando el método toString para mostrar la información de cada persona, profesor y estudiante
        Person person1 = new Person(1L, "P001", "123456789", "John", "Doe", true);
        Person person2 = new Person(2L, "P002", "987654321", "Jane", "Smith", true);
        Person person3 = new Person(3L, "P003", "456789123", "Alice", "Johnson", true);
        Person person4 = new Person(4L, "P004", "789123456", "Bob", "Brown", true);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);

        Teacher teacher1 = new Teacher(5L, "T001", "111222333", "Dr. Smith", "Johnson", true, 1L);
        Student student1 = new Student(6L, "S001", "444555666", "Alice", "Williams", true, null, 1L);

        System.out.println(teacher1);
        System.out.println(student1);

        //constructores vacios con setters y getters
        Teacher teacher2 = new Teacher();
        teacher2.setUserId(7L);
        teacher2.setCode("T002");
        teacher2.setDocumentNumber("777888999");
        teacher2.setFirstName("Dr. Brown");
        teacher2.setLastName("Smith");
        teacher2.setStatus(true);
        teacher2.setTeacherId(2L);

        Student student2 = new Student();
        student2.setUserId(8L);
        student2.setCode("S002");
        student2.setDocumentNumber("000111222");
        student2.setFirstName("Bob");
        student2.setLastName("Davis");
        student2.setStatus(true);
        student2.setBirthDate(null);
        student2.setStudentId(2L);

        System.out.println(teacher2);
        System.out.println(student2);

    }
}
