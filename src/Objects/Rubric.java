package Objects;

public class Rubric {
    private int id;
    private String rubricName;
    private String rubricDescription;
    private String dueDate;
    private int grateValue;

    public Rubric() {
    }

    public Rubric(int id, String rubricName, String rubricDescription, String dueDate, int grateValue) {
        this.id = id;
        this.rubricName = rubricName;
        this.rubricDescription = rubricDescription;
        this.dueDate = dueDate;
        this.grateValue = grateValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRubricName() {
        return rubricName;
    }

    public void setRubricName(String rubricName) {
        this.rubricName = rubricName;
    }

    public String getRubricDescription() {
        return rubricDescription;
    }

    public void setRubricDescription(String rubricDescription) {
        this.rubricDescription = rubricDescription;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getGrateValue() {
        return grateValue;
    }

    public void setGrateValue(int grateValue) {
        this.grateValue = grateValue;
    }
    


}
