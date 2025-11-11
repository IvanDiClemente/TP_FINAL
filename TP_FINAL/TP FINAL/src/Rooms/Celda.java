package Rooms;
import Guards.Guardia;
import Guards.Rango;
import Guards.Turno;
import Prisoners.Prisionero;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDateTime;


public abstract class Celda {

    private boolean ocupado;
    private boolean lleno;
    private int numeroDeCelda;
    private int capacidad;
    private Guardia guardiaAsignado;
    private LocalDateTime ultimaInspeccion;


    /*
    public void agregarPreso(//Parametros de preso){

    }

    public void eliminarPreso(int index){
    }

    public void eliminarPresoDNI(int DNI){
    }
    */

    public boolean isOcupado() {
        return ocupado;
    }

    public void ChangeOcupado() {
        if(this.ocupado) {
            this.ocupado = false;
        }else {
            this.ocupado = true;
        }
    }

    public boolean isLleno() {
        return lleno;
    }

    public void ChangeLleno() {
        if(this.lleno) {
            this.lleno = false;
        }else {
            this.lleno = true;
        }
    }

    public String getUltimaInspeccion() {
        return ultimaInspeccion.toString();
    }

    public void setUltimaInspeccion(LocalDateTime ultimaInspeccion) {
        this.ultimaInspeccion = ultimaInspeccion;
    }

    public void asignarGuardia(String nombre, String apellido, String dni, int edad, LocalDate fechaNacimiento, int legajo, Turno turno, int numPabellon, boolean enServicio, Rango rango){
        guardiaAsignado=new Guardia(nombre, apellido, dni, edad, fechaNacimiento, legajo, turno, numPabellon, enServicio, rango);
    }


    public Celda(int numeroDeCelda, int capacidad) {
        this.numeroDeCelda = numeroDeCelda;
        this.capacidad = capacidad;
    }

    /*Cuando prisionero este realizado, hace falta hacer un constructor para meter directamente prisioneros a la celda */
}