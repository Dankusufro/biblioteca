package tarea2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Dankus");
        Tarea tarea1 = new Tarea("Hacer compras", "Comprar comida para la semana", LocalDate.now().plusDays(3));
        Tarea tarea2 = new Tarea("Limpiar casa", "Limpiar todas las habitaciones", LocalDate.now().plusDays(7));
        usuario1.agregarTarea(tarea1);
        usuario1.agregarTarea(tarea2);
        ArrayList<Tarea> tareasUsuario1 = usuario1.getTareas();
        for (Tarea tarea : tareasUsuario1) {
            System.out.println(tarea.getNombre() + " - " + tarea.getDescripcion() + " - Fecha de vencimiento: " + tarea.getFechaVencimiento());
        }

    }
}
//Supongamos que queremos modelar una aplicación de lista de tareas.
//Tendremos una clase "Tarea" que representará una tarea en sí misma,
//una clase "ListaDeTareas" que representará una lista de tareas y
//una clase "Usuario" que representará al usuario que tiene la lista de tareas.
//
//La clase "Tarea" tendrá atributos como "nombre", "descripción" y "fecha de vencimiento".
//La clase "ListaDeTareas" tendrá una lista de tareas y métodos para agregar y eliminar tareas de la lista.
// La clase "Usuario" tendrá un nombre de usuario y una lista de tareas asignadas a él.

//Ahora, podemos crear objetos de estas clases y utilizar sus métodos
//para agregar tareas a una lista de tareas para un usuario específico:
//Este código creará un usuario con el nombre de usuario "SU NOMBRE" y
//agregará dos tareas a su lista de tareas. Luego, obtendremos la lista
//de tareas del usuario y las imprimiremos en la consola junto con su fecha de vencimiento.
