package Methods;

import Main.Admin;
import Objects.Person;

public class User {

    Person person = new Person();

    public User() {
    }

    public int newID() {
        int id;
        if (new Admin().userList.isEmpty()) {
            id = 0;
        } else {
            id = new Admin().userList.get(new Admin().userList.size() - 1).getId() + 1;
        }
        return id;
    }

    public String addUser(String access, String name, String lastName, int personalID, int age, String email, String password) {
        int id = newID();
        new Admin().userList.add(new Person(id, access, name, lastName, email, personalID, password, age));
        return ("Usuario nuevo: nID: " + id + " - Acceso: " + access + " - Nombre: " + name + " - Apellidos: " + lastName + " - Correo: " + email + " - Cedula: " + personalID + " - Contrasena: " + password + " - Edad: " + age);
    }

    public String modifyUser(int id) {

        String access = new Admin().userList.get(id).getAccess();
        String name = new Admin().userList.get(id).getName();
        String lastName = new Admin().userList.get(id).getLastName();
        String email = new Admin().userList.get(id).getEmail();
        String password = new Admin().userList.get(id).getPassword();
        int personalID = new Admin().userList.get(id).getPersonalID();
        int age = new Admin().userList.get(id).getAge();

        boolean modificado = false;
        for (Person i : new Admin().userList) {
            if (i.getId() == id) {
                new Admin().userList.remove(i);
                new Admin().userList.add(new Person(id, access, name, lastName, email, personalID, password, age));
                modificado = true;
            }
        }

        if (modificado) {
            return "Usuario modificado correctamente";
        }
        return null;
    }

    public String printUser(int i) {

        int id = new Admin().userList.get(i).getId();
        String name = new Admin().userList.get(i).getName();
        String lastName = new Admin().userList.get(i).getLastName();
        String email = new Admin().userList.get(i).getEmail();
        String password = new Admin().userList.get(i).getPassword();
        int personalID = new Admin().userList.get(i).getPersonalID();
        int age = new Admin().userList.get(i).getAge();

        return ("\nID: " + id + " - Nombre: " + name + " - Apellidos: " + lastName + " - Correo: " + email + " - Contrasena: " + password + " - Cedula: " + personalID + " - Edad: " + age);
    }

    public String listUser() {

        String mensaje = ("Lista de usuarios:\n");
        for (int i = 0; i < new Admin().userList.size(); i++) {
            mensaje = mensaje + printUser(i);
        }
        return mensaje;
    }

    public String searchUserByNameAndLastName(String searchName) {
        String mensaje = "Resultados: \n\n";

        for (int i = 0; i < new Admin().userList.size(); i++) {
            String element = new Admin().userList.get(i).getName() + " " + new Admin().userList.get(i).getLastName();
            if (element.toLowerCase().contains(searchName.toLowerCase())) {
                mensaje = mensaje + printUser(i);
            }
        }

        return mensaje;
    }

    public String searchUserByEmail(String searchEmail) {
        String mensaje = "Resultados: \n\n";
        for (int i = 0; i < new Admin().userList.size(); i++) {
            String element = new Admin().userList.get(i).getEmail();
            if (element.toLowerCase().contains(searchEmail.toLowerCase())) {
                mensaje = mensaje + printUser(i);
            }
        }
        return mensaje;
    }

    public String deleteUser(int id) {
        try {
            new Admin().userList.remove(id);
            return "Usuario eliminado correctamente";
        } catch (Exception e) {
            return "El usuario no fue eliminado";
        }
    }
}