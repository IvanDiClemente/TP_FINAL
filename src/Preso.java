public class Preso {
   /// ATRIBUTOS

    private String nombre;
    private String fechaDeIngreso;
    private int celda;
    private CrimenCometido crimenCometido;
    private Seguridad seguridad;

   /// CONSTRUCTOR

    public Preso(String nombre, String fechaDeIngreso, int celda, CrimenCometido crimenCometido, Seguridad seguridad) {
        this.nombre = nombre;
        this.fechaDeIngreso = fechaDeIngreso;
        this.celda = celda;
        this.crimenCometido = crimenCometido;
        this.seguridad = seguridad;
    }

    /// GETTER AND SETTER
    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(String fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public int getCelda() {
        return celda;
    }

    public void setCelda(int celda) {
        this.celda = celda;
    }

    public CrimenCometido getCrimenCometido() {
        return crimenCometido;
    }

    public void setCrimenCometido(CrimenCometido crimenCometido) {
        this.crimenCometido = crimenCometido;
    }

    public Seguridad getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(Seguridad seguridad) {
        this.seguridad = seguridad;
    }

    /// METODOS
/// cumplir condena
    public String cumplirCondena() {
        return nombre + " está cumpliendo su condena desde " + fechaDeIngreso + ".";
    }
/// agregar delito
    public String agregarDelito(CrimenCometido nuevoCrimen) {
         this.crimenCometido = nuevoCrimen;
             return "Nuevo delito registrado para " + nombre + ": " + nuevoCrimen;
    }
/// solicitar visita
    public String solicitarVisita(String visitante) {
        return nombre + " ha solicitado una visita de " + visitante + ".";
    }
/// asignar celda
    public String asignarCelda(int nuevaCelda) {
        this.celda = nuevaCelda;
         return nombre + " fue asignado a la celda número " + celda + ".";
    }

    /// TO STRING
    @Override
    public String toString() {
        return "Preso{" +
                "nombre='" + nombre + '\'' +
                ", fechaDeIngreso='" + fechaDeIngreso + '\'' +
                ", celda=" + celda +
                ", crimenCometido=" + crimenCometido +
                ", seguridad=" + seguridad +
                '}';
    }
}
