package co.edu.cesde.ga.app.models;

public class Grade {
    Long gradeId;
    GroupSubject groupSubject;
    Student student;
    Double finalScore;
    String observation;

    public Grade() {
    }

    public Grade(Long gradeId, GroupSubject groupSubject, Student student, Double finalScore, String observation) {
        this.gradeId = gradeId;
        this.groupSubject = groupSubject;
        this.student = student;
        this.finalScore = finalScore;
        this.observation = observation;
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    public GroupSubject getGroupSubject() {
        return groupSubject;
    }

    public void setGroupSubject(GroupSubject groupSubject) {
        this.groupSubject = groupSubject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

        @Override
    public String toString() {
        return "grade =" + "Grade{" +
                "gradeId=" + gradeId +
                ", groupSubject=" + groupSubject +
                ", student=" + student +
                ", finalScore=" + finalScore +
                ", observation='" + observation + '\'' +
                '}';
    }
}
