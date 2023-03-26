package Objects;

public class ClassList {
    private int idCourse;
    private int idPerson;

    public ClassList() {
    }

    public ClassList(int idCourse, int idPerson) {
        this.idCourse = idCourse;
        this.idPerson = idPerson;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }
}
