
public class Students {

    // Attributes (fields) sesuai dengan class diagram
    private Integer npm;
    private String fullName;
    private String className;
    private Integer semester;
    private Float gpa;

    // Method untuk set dan get nilai
    public Integer getNPM(Integer value) {
        this.npm = value;
        return this.npm;
    }

    public String getFullName(String value) {
        this.fullName = value;
        return this.fullName;
    }

    public String getClassName(String value) {
        this.className = value;
        return this.className;
    }

    public Integer getSemester(Integer value) {
        this.semester = value;
        return this.semester;
    }

    public Float getGPA(Float value) {
        this.gpa = value;
        return this.gpa;
    }
}

