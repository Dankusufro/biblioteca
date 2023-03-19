package tarea2;

import java.time.LocalDate;

public class Tarea {
    private String nombre;
    private String descripcion;

    private LocalDate fechaVencimiento;

    public Tarea(String nombre, String descripcion, LocalDate fechaVencimiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }


}
