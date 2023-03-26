package Methods;

import Main.Admin;
import Objects.CourseRubric;

public class CoursesRubrics {

    CourseRubric cr = new CourseRubric();

    public CoursesRubrics() {
    }

    public int newID() {
        int id;
        if (new Admin().crList.isEmpty()) {
            id = 0;
        } else {
            id = new Admin().crList.get(new Admin().crList.size() - 1).getId() + 1;
        }
        return id;
    }

    public String addCourseRubric(int idCourse, int idRubric) {
        int id = newID();
        new Admin().crList.add(new CourseRubric(id, idCourse, idRubric));
        return ("Curso - Rubro nuevo:\n\nID: " + id + " - Curso: " + new Admin().courseList.get(idCourse).getCourseName() + " - Rubro: " + new Admin().rubricList.get(idRubric).getRubricName());
    }

    public String modifyCourseRubric(int id, int idCourse, int idRubric) {
        boolean modificado = false;
        for (int i = 0; i < new Admin().crList.size(); i++) {
            if (id == new Admin().crList.get(i).getId()) {
                new Admin().crList.set(id, new CourseRubric(i, idCourse, idRubric));
                modificado = true;
            }
        }
        if (modificado) {
            return "Elemento modificado correctamente";
        } else {
            return "El elemento no fue encontrado";
        }
    }

    public String printCourseRubric(int i) {
        int id = new Admin().crList.get(i).getId();
        int idCourse = new Admin().crList.get(i).getIdCourse();
        int idRubric = new Admin().crList.get(i).getIdRubric();
        return ("\nID: " + id + " - Curso: " + new Admin().courseList.get(idCourse).getCourseName() + " - Rubro: " + new Admin().rubricList.get(idRubric).getRubricName());
    }

    public String listCourseRubric() {
        String mensaje = ("Lista de cursos rubros:\n");
        for (int i = 0; i < new Admin().crList.size(); i++) {
            mensaje = mensaje + printCourseRubric(i);
        }
        return mensaje;
    }

    public String searchRubricByCourse(String searchCourse) {
        String resultado = "Resultado:\n\n";

        for (int i = 0; i < new Admin().crList.size(); i++) {
            String element = new Admin().courseList.get(new Admin().crList.get(i).getIdCourse()).getCourseName();
            if (element.toLowerCase().contains(searchCourse.toLowerCase())) {
                resultado = resultado + printCourseRubric(i);
            }
        }
        return resultado;
    }

    public String searchRubricByRubric(String searchRubric) {
        String resultado = "Resultado:\n\n";

        for (int i = 0; i < new Admin().crList.size(); i++) {
            String element = new Admin().rubricList.get(new Admin().crList.get(i).getIdRubric()).getRubricName();
            if (element.toLowerCase().contains(searchRubric.toLowerCase())) {
                resultado = resultado + printCourseRubric(i);
            }
        }
        return resultado;
    }

    public String deleteCourse(int id) {
        boolean eliminado = false;
        for (int i = 0; i < new Admin().crList.size(); i++) {
            if (id == new Admin().crList.get(i).getId()) {
                new Admin().crList.remove(i);
                eliminado = true;
            }
        }
        if (eliminado) {
            return "Elemento eliminado correctamente";
        } else {
            return "El elemento no fue encontrado";
        }
    }

    public String listRubricByCourses(int idCR) {

        boolean encontrado = false;
        String mensaje = "Resultados: ";
        for (int i = 0; i < new Admin().crList.size(); i++) {
            if (idCR == new Admin().crList.get(i).getId()) {
                mensaje = mensaje + printCourseRubric(i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            mensaje = mensaje + "\n no se encontro el curso rubro";

        }
        return mensaje;
    }
}
