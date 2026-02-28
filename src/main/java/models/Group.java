package models;

public class Group {
    Long groupId;
    String code;
    Program program;
    Period period;
    String shift;

    public Group() {
    }

    public Group(Long groupId, String code, Program program, Period period, String shift) {
        this.groupId = groupId;
        this.code = code;
        this.program = program;
        this.period = period;
        this.shift = shift;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "group =" + "Group{" +
                "groupId=" + groupId +
                ", code='" + code + '\'' +
                ", program=" + program +
                ", period=" + period +
                ", shift='" + shift + '\'' +
                '}';
    }
}
