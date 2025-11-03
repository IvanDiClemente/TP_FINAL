package Guards;

import java.time.LocalDate;

public class CapacitadoTaser extends Guardia {
    private LocalDate fechaCapacitacion;
    private boolean tieneTaser;

    public CapacitadoTaser(int legajo, Turno turno, int numPabellon, boolean enServicio, LocalDate fechaCapacitacion, boolean tieneTaser) {
        super(legajo, turno, numPabellon, enServicio);
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
