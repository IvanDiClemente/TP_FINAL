package Guards;

import Persona.Persona;

import java.time.LocalDate;

public class Armado extends Persona {
    private Arma arma;

    public Armado(String nombre, String apellido, String dni, int edad, LocalDate fechaNacimiento, Arma arma) {
        super(nombre, apellido, dni, edad, fechaNacimiento);
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    @Override
    public String toString() {
        return "Guards.Armado{" +
                "arma=" + arma +
                "} " + super.toString();
    }
}
