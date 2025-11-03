package Guards;

import java.time.LocalDate;

public class Comun extends Guardia {
    private boolean tieneGasPimienta;

    public Comun(String nombre, String apellido, String dni, int edad, LocalDate fechaNacimiento, int legajo, Turno turno, int numPabellon, boolean enServicio, Rango rango, boolean tieneGasPimienta) {
        super(nombre, apellido, dni, edad, fechaNacimiento, legajo, turno, numPabellon, enServicio, rango);
        this.tieneGasPimienta = tieneGasPimienta;
    }

    //getters
    public boolean isTieneGasPimienta() {
        return tieneGasPimienta;
    }

    @Override
    public String toString() {
        return "Guards.Comun{" +
                "tieneGasPimienta=" + tieneGasPimienta +
                "} " + super.toString();
    }
}
