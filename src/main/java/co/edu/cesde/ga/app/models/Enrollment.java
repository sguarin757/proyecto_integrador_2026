package co.edu.cesde.ga.app.models;
import java.time.LocalDate;

public class Enrollment {
    Long enrollmentId;
    Student student;
    Program program;
    Period period;
    Boolean status;
    LocalDate enrollmentAt;

    public Enrollment() {
    }

    public Enrollment(Long enrollmentId, Student student, Program program, Period period, Boolean status, LocalDate enrollmentAt) {
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.program = program;
        this.period = period;
        this.status = status;
        this.enrollmentAt = enrollmentAt;
    }

    public Long getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(Long enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDate getEnrollmentAt() {
        return enrollmentAt;
    }

    public void setEnrollmentAt(LocalDate enrollmentAt) {
        this.enrollmentAt = enrollmentAt;
    }

    @Override
    public String toString() {
        return "enrollment =" + "Enrollment{" +
                "enrollmentId=" + enrollmentId +
                ", student=" + student +
                ", program=" + program +
                ", period=" + period +
                ", status=" + status +
                ", enrollmentAt=" + enrollmentAt +
                '}';
    }
}
