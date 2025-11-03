package Guards;

import java.time.LocalDate;

public class CapacitadoTaser extends Guardia {
    private LocalDate fechaCapacitacion;
    private boolean tieneTaser;

    public CapacitadoTaser(String nombre, String apellido, String dni, int edad, LocalDate fechaNacimiento, int legajo, Turno turno, int numPabellon, boolean enServicio, Rango rango, LocalDate fechaCapacitacion, boolean tieneTaser) {
        super(nombre, apellido, dni, edad, fechaNacimiento, legajo, turno, numPabellon, enServicio, rango);
        this.fechaCapacitacion = fechaCapacitacion;
        this.tieneTaser = tieneTaser;
    }

    //getters
    public LocalDate getFechaCapacitacion() {
        return fechaCapacitacion;
    }

    public boolean isTieneTaser() {
        return tieneTaser;
    }

    @Override
    public String toString() {
        return "Guards.CapacitadoTaser{" +
                "fechaCapacitacion=" + fechaCapacitacion +
                ", tieneTaser=" + tieneTaser +
                "} " + super.toString();
    }
}
