package co.edu.cesde.ga.app.models;
import java.time.LocalDate;

public class Student extends Person {
    private LocalDate birthDate;
    private Long studentId;

    public Student() {
        super();//permite llenar los atributos de la clase padre
        this.birthDate = null;
        this.studentId = null;
    }

    public Student(String code, String documentNumber, String firstName, String lastName, Boolean status, LocalDate birthDate, Long studentId) {
        super(code, documentNumber, firstName, lastName, status);
        this.birthDate = birthDate;
        this.studentId = studentId;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "student =" + "Student{" +
                ", code='" + getCode() + '\'' +
                ", documentNumber='" + getDocumentNumber() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", status=" + getStatus() +
                ", birthDate=" + birthDate +
                ", studentId=" + studentId +
                '}';
    }
}
