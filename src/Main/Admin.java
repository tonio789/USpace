package Main;

import Methods.Courses;
import Methods.CoursesRubrics;
import Methods.Rubrics;
import Methods.Students;
import Methods.User;
import Objects.Course;
import Objects.CourseRubric;
import Objects.Person;
import Objects.Rubric;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {

    Scanner sc = new Scanner(System.in);
    User user = new User();
    Courses courses = new Courses();
    Rubrics rubrics = new Rubrics();
    CoursesRubrics coursesRubrics = new CoursesRubrics();
    Students students = new Students();

    public Person log;
    
    
    public static ArrayList<Person> userList = new ArrayList<>();
    public static ArrayList<Rubric> rubricList = new ArrayList<>();
    public static ArrayList<Course> courseList = new ArrayList<>();
    public static ArrayList<CourseRubric> crList = new ArrayList<>();

    public Admin() {
    }

//    public void menu() {
//
//        int M = 0;
//        int MU = 0;
//        int MC = 0;
//        int MR = 0;
//        int MCR = 0;
//        int MS = 0;
//
//        do {
//
//            System.out.println("Menu"
//                    + "\n1. Usuarios"
//                    + "\n2. Cursos"
//                    + "\n3. Rubros"
//                    + "\n4. Cursos Rubros"
//                    + "\n5. Alumnos"
//                    + "\n6. Resultados Finales"
//                    + "\n7. Datos"
//                    + "\n8. Logout"
//                    + "\nIngrese una opcion:");
//            M = sc.nextInt();
//
//            switch (M) {
//                case 1:
//
//                    do {
//                        System.out.println("Menu Usuarios"
//                                + "\n1. Agregar Usuario"
//                                + "\n2. Lista de Usuario"
//                                + "\n3. Buscar Usuarios"
//                                + "\n4. Modificar Usuario"
//                                + "\n5. Eliminar Usuario"
//                                + "\n6. Menu principal"
//                                + "\nIngrese una opcion:");
//                        MU = sc.nextInt();
//
//                        switch (MU) {
//                            case 1:
//                                user.addUser();
//                                break;
//                            case 2:
//                                user.listUser();
//                                break;
//                            case 3:
//                                user.searchUser();
//                                break;
//                            case 4:
//                                user.modifyUser();
//                                break;
//                            case 5:
//                                user.deleteUser();
//                                break;
//                            default:
//                        }
//
//                    } while (MU != 6);
//                    break;
//                case 2:
//
//                    do {
//                        System.out.println("Menu Cursos"
//                                + "\n1. Agregar Curso"
//                                + "\n2. Lista de Cursos"
//                                + "\n3. Buscar Curso"
//                                + "\n4. Modificar Curso"
//                                + "\n5. Cerrar Curso"
//                                + "\n6. Eliminar Curso"
//                                + "\n7. Menu principal"
//                                + "\nIngrese una opcion:");
//                        MC = sc.nextInt();
//                        sc.nextLine();
//
//                        switch (MC) {
//                            case 1:
//                                courses.addCourse();
//
//                                break;
//                            case 2:
//                                courses.listCourse();
//
//                                break;
//                            case 3:
//                                courses.searchCourse();
//
//                                break;
//                            case 4:
//                                courses.modifyCourse();
//
//                                break;
//                            case 5:
//                                courses.modifyCourseStatus();
//
//                                break;
//                            case 6:
//                                courses.deleteCourse();
//
//                                break;
//                            default:
//                        }
//
//                    } while (MC != 7);
//
//                    break;
//                case 3:
//                    do {
//                        System.out.println("Menu Rubros"
//                                + "\n1. Agregar Rubro"
//                                + "\n2. Lista de Rubros"
//                                + "\n3. Lista de Rubros por Curso"
//                                + "\n4. Buscar Rubro"
//                                + "\n5. Modificar Rubro"
//                                + "\n6. Eliminar Rubro"
//                                + "\n7. Menu principal"
//                                + "\nIngrese una opcion:");
//                        MR = sc.nextInt();
//
//                        switch (MR) {
//                            case 1:
//                                rubrics.addRubric();
//                                break;
//                            case 2:
//                                rubrics.listRubric();
//                                break;
//                            case 3:
//                                coursesRubrics.listRubricByCourses();
//                                break;
//                            case 4:
//                                rubrics.searchRubric();
//                                break;
//                            case 5:
//                                rubrics.modifyRubric();
//                                break;
//                            case 6:
//                                rubrics.deleteRubric();
//                                break;
//                            default:
//                        }
//
//                    } while (MR != 7);
//                    break;
//                case 4:
//                    do {
//                        System.out.println("Menu Cursos Rubros"
//                                + "\n1. Agregar Curso Rubro"
//                                + "\n2. Lista de Cursos Rubros"
//                                + "\n3. Buscar Curso Rubro"
//                                + "\n4. Modificar Curso Rubro"
//                                + "\n5. Eliminar Curso Rubro"
//                                + "\n6. Menu principal"
//                                + "\nIngrese una opcion:");
//                        MCR = sc.nextInt();
//
//                        switch (MCR) {
//                            case 1:
//                                coursesRubrics.addCourseRubric();
//                                break;
//                            case 2:
//                                coursesRubrics.listCourseRubric();
//                                break;
//                            case 3:
//                                coursesRubrics.searchCourseRubric();
//                                break;
//                            case 4:
//                                coursesRubrics.modifyCourseRubric();
//                                break;
//                            case 5:
//                                coursesRubrics.deleteCourseRubric();
//                                break;
//                            default:
//                        }
//
//                    } while (MCR != 6);
//
//                    break;
//                case 5:
//                    do {
//                        System.out.println("Menu Alumnos"
//                                + "\n1. Agregar Alumno"
//                                + "\n2. Lista de Alumnos"
//                                + "\n3. Buscar Alumno"
//                                + "\n4. Modificar Alumno"
//                                + "\n5. Eliminar Alumno"
//                                + "\n6. Menu principal"
//                                + "\nIngrese una opcion:");
//                        MS = sc.nextInt();
//
//                        switch (MS) {
//                            case 1:
//                                students.addStudent();
//                                break;
//                            case 2:
//                                students.listStudent();
//                                break;
//                            case 3:
//                                students.searchStudent();
//                                break;
//                            case 4:
//                                students.modifyStudent();
//                                break;
//                            case 5:
//                                students.deleteStudent();
//                                break;
//                            default:
//                        }
//
//                    } while (MS != 6);
//
//                    break;
//                case 6:
//                    System.out.println("Menu Resultados finales - En desarrollo");
//
//                    break;
//                case 7:
//                    System.out.println("Menu Datos - En desarrollo");
//
//                    break;
//                default:
//            }
//        } while (M != 8);
//    }
}
