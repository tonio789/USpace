package Objects;

public class CourseRubric {
    
    private int id;
    private int idCourse;
    private int idRubric;

    public CourseRubric() {
    }

    public CourseRubric(int id, int idCourse, int idRubric) {
        this.id = id;
        this.idCourse = idCourse;
        this.idRubric = idRubric;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    

    
    
}
