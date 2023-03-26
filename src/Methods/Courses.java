package Methods;

import Main.Admin;
import Objects.Course;
import Objects.Person;

public class Courses {

    Person person = new Person();
    Course course = new Course();

    public Courses() {
    }

    public int newID() {
        int id;
        if (new Admin().courseList.isEmpty()) {
            id = 0;
        } else {
            id = new Admin().courseList.get(new Admin().courseList.size() - 1).getId() + 1;
        }
        return id;
    }

    public String addCourse(String courseName, String courseDescription, int idProfesor) {
        int id = newID();
        boolean statusOpen = false;
        new Admin().courseList.add(new Course(id, courseName, courseDescription, idProfesor, statusOpen));
        return ("Curso nuevo:\n\nID: " + id + " - Nombre del curso: " + courseName + " - Descripcion: " + courseDescription + " - Profesor: " + new Admin().userList.get(idProfesor).getName() + " " + new Admin().userList.get(idProfesor).getLastName());
    }

    public String modifyCourse(int id, String courseName, String courseDescription, int idProfesor, boolean status) {
        boolean modificado = false;
        for (int i = 0; i < new Admin().courseList.size(); i++) {
            if (id == new Admin().courseList.get(i).getId()) {
                new Admin().courseList.set(i, new Course(id, courseName, courseDescription, idProfesor, status));
                modificado = true;
            }
        }
        if (modificado) {
            return "Elemento modificado correctamente";
        } else {
            return "El elemento no fue encontrado";
        }
    }

    public String modifyCourseStatus(int id, boolean status) {
        boolean modificado = false;
        for (int i = 0; i < new Admin().courseList.size(); i++) {
            if (id == new Admin().courseList.get(i).getId()) {

                String courseName = new Admin().courseList.get(i).getCourseName();
                String courseDescription = new Admin().courseList.get(i).getCourseDescription();
                int idProfesor = new Admin().courseList.get(i).getIdPerson();

                new Admin().courseList.set(i, new Course(id, courseName, courseDescription, idProfesor, status));
                modificado = true;
            }
        }
        if (modificado) {
            return "Elemento modificado correctamente";
        } else {
            return "El elemento no fue encontrado";
        }
    }

    public String status(int idCourse) {

        boolean encontrado = false;
        for (int i = 0; i < new Admin().courseList.size(); i++) {
            if (new Admin().courseList.get(i).getId() == idCourse) {

                if (new Admin().courseList.get(i).getStatusOpen()) {
                    return "El curso esta abierto";
                }
            }
        }
        if (encontrado) {
            return "El curso esta cerrado";
        } else {
            return "El elemento no fue encontrado";
        }
    }

    public String printCourse(int i) {
        int id = new Admin().courseList.get(i).getId();
        String courseName = new Admin().courseList.get(i).getCourseName();
        String courseDescription = new Admin().courseList.get(i).getCourseDescription();
        String idPerson = new Admin().userList.get(new Admin().courseList.get(i).getIdPerson()).getName() + " " + new Admin().userList.get(new Admin().courseList.get(i).getIdPerson()).getLastName();
        String status = status(i);

        return ("\nID: " + id + " - Nombre del curso: " + courseName + " - Descripcion: " + courseDescription + " - Profesor: " + idPerson + " - Status: " + status);
    }

    public String listCourse() {
        String mensaje = ("Lista de usuarios:\n");
        for (int i = 0; i < new Admin().courseList.size(); i++) {
            mensaje = mensaje + printCourse(i);
        }
        return mensaje;
    }

    public String searchCourseByName(String searchCourse) {
        String resultado = "Resultado:\n\n";
        for (int i = 0; i < new Admin().courseList.size(); i++) {
            String element = new Admin().courseList.get(i).getCourseName();
            if (element.toLowerCase().contains(searchCourse.toLowerCase())) {
                resultado = resultado + printCourse(i);
            }
        }
        return resultado;
    }

    public String searchCourseByDescription(String searchDescription) {
        String resultado = "Resultado:\n\n";
        for (int i = 0; i < new Admin().courseList.size(); i++) {
            String element = new Admin().courseList.get(i).getCourseDescription();
            if (element.toLowerCase().contains(searchDescription.toLowerCase())) {
                resultado = resultado + printCourse(i);
            }
        }
        return resultado;
    }

    public String deleteCourse(int id) {
        boolean eliminado = false;
        for (int i = 0; i < new Admin().courseList.size(); i++) {
            if (id == new Admin().courseList.get(i).getId()) {
                new Admin().courseList.remove(i);
                eliminado = true;
            }
        }
        if (eliminado) {
            return "Elemento eliminado correctamente";
        } else {
            return "El elemento no fue encontrado";
        }
    }
}
