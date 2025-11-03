package Rooms;
import Prisoners.Prisionero;
import java.util.ArrayList;
import java.time.LocalDateTime;


public abstract class Celda {

    private boolean ocupado;
    private boolean lleno;
    private int numeroDeCelda;
    private int capacidad;
    private ArrayList<Prisionero> prisioneros;
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


    public Celda(int numeroDeCelda, int capacidad) {
        this.numeroDeCelda = numeroDeCelda;
        this.capacidad = capacidad;
    }

    /*Cuando prisionero este realizado, hace falta hacer un constructor para meter directamente prisioneros a la celda */
}