package Guards;

public class Comun extends Guardia {
    private boolean tieneGasPimienta;

    public Comun(int legajo, Turno turno, int numPabellon, boolean enServicio, boolean tieneGasPimienta) {
        super(legajo, turno, numPabellon, enServicio);
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
