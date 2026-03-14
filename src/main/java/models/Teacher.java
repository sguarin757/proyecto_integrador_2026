package models;

public class Teacher extends Person {
    private Long teacherId;

    public Teacher() {

    }
     public Teacher(String code, String documentNumber, String firstName, String lastName, Boolean status, Long teacherId) {
         super(code, documentNumber, firstName, lastName, status);
         this.teacherId = teacherId;
     }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "teacher =" + "Teacher{" +
                ", code='" + getCode() + '\'' +
                ", documentNumber='" + getDocumentNumber() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", status=" + getStatus() +
                ", teacherId=" + teacherId +
                '}';
    }
}
