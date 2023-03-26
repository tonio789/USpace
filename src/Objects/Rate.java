package Objects;

public class Rate {
    private int idCourse;
    private int idRubric;
    private int idPerson;
    private int points;
    private int rate;

    public Rate() {
    }

    public Rate(int idCourse, int idRubric, int idPerson, int points, int rate) {
        this.idCourse = idCourse;
        this.idRubric = idRubric;
        this.idPerson = idPerson;
        this.points = points;
        this.rate = rate;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public int getIdRubric() {
        return idRubric;
    }

    public void setIdRubric(int idRubric) {
        this.idRubric = idRubric;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    
    
    
}
