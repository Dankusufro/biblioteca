package tarea2;

import java.util.ArrayList;

public class ListaDeTareas {

    private ArrayList<Tarea> tareas = new ArrayList<>();

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void eliminarTarea(Tarea tarea) {
        tareas.remove(tarea);
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

}
