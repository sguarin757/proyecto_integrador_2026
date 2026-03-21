package co.edu.cesde.ga.app.Repository;
import co.edu.cesde.ga.app.models.Student;
import java.util.List;

public interface StudentRepository {

    Student createStudent(Student student);

    boolean deleteStudent(Long studentId);

    boolean updateStudent(Student student);

    Student findById(Long studentId);

    boolean finBydocumentNumber(String documentNumber);

    List<Student> findAll();

    boolean existsById(Long studentId);

     boolean existsByDocumentNumber(String documentNumber);


}
