package Guards;

import Persona.Persona;

import java.time.LocalDate;

public class Guardia extends Persona {
    private int legajo;
    private Turno turno;
    private int numPabellon;
    private boolean enServicio;
    private Rango rango;

    public Guardia(String nombre, String apellido, String dni, int edad, LocalDate fechaNacimiento, int legajo, Turno turno, int numPabellon, boolean enServicio, Rango rango) {
        super(nombre, apellido, dni, edad, fechaNacimiento);
        this.legajo = legajo;
        this.turno = turno;
        this.numPabellon = numPabellon;
        this.enServicio = enServicio;
        this.rango = rango;
    }

    //getters
    public int getLegajo() {
        return legajo;
    }

    public Turno getTurno() {
        return turno;
    }

    public int getNumPabellon() {
        return numPabellon;
    }

    public boolean isEnServicio() {
        return enServicio;
    }

    public Rango getRango() {
        return rango;
    }

    @Override
    public String toString() {
        return "Guardia{" +
                "legajo=" + legajo +
                ", turno=" + turno +
                ", numPabellon=" + numPabellon +
                ", enServicio=" + enServicio +
                '}';
    }
}
