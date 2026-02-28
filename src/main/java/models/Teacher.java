package models;

public class Teacher extends Person {
    Long teacherId;

    public Teacher() {
    }
     public Teacher(Long userId, String code, String documentNumber, String firstName, String lastName, Boolean status, Long teacherId) {
         super(userId, code, documentNumber, firstName, lastName, status);
         this.teacherId = teacherId;
     }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
