package Objects;

public class Course {

    private int id;
    private String courseName;
    private String courseDescription;
    private int idPerson;
    private boolean statusOpen;

    public Course() {
    }

    public Course(int id, String courseName, String courseDescription, int idPerson, boolean statusOpen) {
        this.id = id;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.idPerson = idPerson;
        this.statusOpen = statusOpen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public boolean getStatusOpen() {
        return statusOpen;
    }

    public void setStatusOpen(boolean statusOpen) {
        this.statusOpen = statusOpen;
    }

   

}
