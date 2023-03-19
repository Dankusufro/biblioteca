
package tarea2;

import java.util.ArrayList;

public class Usuario {
    private String nombreUsuario;
    private ListaDeTareas listaDeTareas = new ListaDeTareas();

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void agregarTarea(Tarea tarea) {
        listaDeTareas.agregarTarea(tarea);
    }

    public void eliminarTarea(Tarea tarea) {
        listaDeTareas.eliminarTarea(tarea);
    }

    public ArrayList<Tarea> getTareas() {
        return listaDeTareas.getTareas();
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
}

