package Methods;

import Main.Admin;
import Objects.Rubric;

public class Rubrics {

    Rubric rubric = new Rubric();

    public Rubrics() {
    }

    public int newID() {
        int id;
        if (new Admin().rubricList.isEmpty()) {
            id = 0;
        } else {
            id = new Admin().rubricList.get(new Admin().rubricList.size() - 1).getId() + 1;
        }
        return id;
    }

    public String addRubric(String rubricName, String rubricDescription, String dueDate, int grateValue) {
        int id = newID();
        new Admin().rubricList.add(new Rubric(id, rubricName, rubricDescription, dueDate, grateValue));

        return ("Rubro nuevo: \n\nID: " + id + " - Nombre del rubro: " + rubricName + " - Descripcion del rubro: " + rubricDescription + " - Fecha de entrega: " + dueDate + " - Valor del rubro: " + grateValue);

    }

    public String modifyRubric(int id, String rubricName, String rubricDescription, String dueDate, int grateValue) {
        boolean modificado = false;
        for (int i = 0; i < new Admin().rubricList.size(); i++) {
            if (id == new Admin().rubricList.get(i).getId()) {
                new Admin().rubricList.set(id, new Rubric(i, rubricName, rubricDescription, dueDate, grateValue));
                modificado = true;
            }
        }
        if (modificado) {
            return "Elemento modificado correctamente";
        } else {
            return "El elemento no fue encontrado";
        }
    }

    public String printRubric(int i) {
        int id = new Admin().rubricList.get(i).getId();
        String rubricName = new Admin().rubricList.get(i).getRubricName();
        String rubricDescription = new Admin().rubricList.get(i).getRubricDescription();
        String dueDate = new Admin().rubricList.get(i).getDueDate();
        int grateValue = new Admin().rubricList.get(i).getGrateValue();

        return ("\nID: " + id + " - Nombre del rubro: " + rubricName + " - Descripcion del rubro: " + rubricDescription + " - Fecha de entrega: " + dueDate + " - Valor del rubro: " + grateValue);
    }

    public String listRubric() {

        String mensaje = ("Lista de rubros:\n");
        for (int i = 0; i < new Admin().rubricList.size(); i++) {
            mensaje = mensaje + printRubric(i);
        }
        return mensaje;
    }

    public String searchRubricByName(String searchRubricName) {
        String resultado = "Resultado:\n\n";

        for (int i = 0; i < new Admin().rubricList.size(); i++) {
            String element = new Admin().rubricList.get(i).getRubricName();
            if (element.toLowerCase().contains(searchRubricName.toLowerCase())) {
                resultado = resultado + printRubric(i);
            }
        }
        return resultado;
    }

    public String searchRubricByDescription(String searchRubricDescription) {
        String resultado = "Resultado:\n\n";
        for (int i = 0; i < new Admin().rubricList.size(); i++) {
            String element = new Admin().rubricList.get(i).getRubricDescription();
            if (element.toLowerCase().contains(searchRubricDescription.toLowerCase())) {
                resultado = resultado + printRubric(i);
            }
        }
        return resultado;
    }

    public String deleteRubric(int id) {
        boolean eliminado = false;
        for (int i = 0; i < new Admin().rubricList.size(); i++) {
            if (id == new Admin().rubricList.get(i).getId()) {
                new Admin().rubricList.remove(i);
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
