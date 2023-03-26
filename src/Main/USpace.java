package Main;

import Grafics.Login;
import Objects.Person;

public class USpace {

    public static void main(String[] args) {

        //Precarga
        new Admin().userList.add(new Person(0, "admin", "admin", "", "admin", 0, "admin", 0));
        new Admin().userList.add(new Person(1, "alumno", "alumno", "", "alumno", 0, "alumno", 0));
        new Admin().userList.add(new Person(2, "profesor", "profesor", "", "profesor", 0, "profesor", 0));
        
        //Grafics
        new Login().setVisible(true);
//        Admin admin = new Admin();
//        admin.menu();
    }

}
