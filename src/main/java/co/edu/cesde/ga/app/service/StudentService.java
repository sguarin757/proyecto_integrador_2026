package co.edu.cesde.ga.app.service;
import co.edu.cesde.ga.app.models.Student;
import java.util.List;

public interface StudentService {
        Student create(Student student);

        boolean update(Student updatestudent);

        boolean delete(Long studentId);

        Student findById(Long studentId);

        List<Student> findAll();
}
