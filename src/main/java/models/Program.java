package models;

public class Program {
    Long programId;
    String name;
    String code;

    public Program() {
    }

    public Program(Long programId, String name, String code) {
        this.programId = programId;
        this.name = name;
        this.code = code;
    }

    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
