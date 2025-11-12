public class Visita {
    /// ATRIBUTOS
    private int idVisita;
    private String fechaDeVisita;
    private int horarioDeVisita;
    private AutorizacionVisita autorizacionVisita;
    private String dni;
    private String nombre;
    private int cantidadVisitas;
    private int legajoGuardiaACargo;

    /// CONSTRUCTOR
    public Visita(int idVisita, String fechaDeVisita, String dni, int cantidadVisitas) {
        this.idVisita = idVisita;
        this.fechaDeVisita = fechaDeVisita;
        this.horarioDeVisita = horarioDeVisita;
        this.autorizacionVisita = autorizacionVisita;
        this.dni = dni;
        this.nombre = nombre;
        this.cantidadVisitas = cantidadVisitas;
        this.legajoGuardiaACargo = legajoGuardiaACargo;
    }

    /// GETTER AND SETTER
    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public String getFechaDeVisita() {
        return fechaDeVisita;
    }

    public void setFechaDeVisita(String fechaDeVisita) {
        this.fechaDeVisita = fechaDeVisita;
    }

    public int getHorarioDeVisita() {
        return horarioDeVisita;
    }

    public void setHorarioDeVisita(int horarioDeVisita) {
        this.horarioDeVisita = horarioDeVisita;
    }

    public AutorizacionVisita getAutorizacionVisita() {
        return autorizacionVisita;
    }

    public void setAutorizacionVisita(AutorizacionVisita autorizacionVisita) {
        this.autorizacionVisita = autorizacionVisita;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(int cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public int getLegajoGuardiaACargo() {
        return legajoGuardiaACargo;
    }

    public void setLegajoGuardiaACargo(int legajoGuardiaACargo) {
        this.legajoGuardiaACargo = legajoGuardiaACargo;
    }

    /// METODOS

    /// asignar fecha
    public String asignarFecha (String fecha, int horario) {
        this.fechaDeVisita = fecha;
        this.horarioDeVisita = horario;
        this.cantidadVisitas++;
        this.autorizacionVisita = AutorizacionVisita.SI;

        return "Visita asignada a " + nombre + "DNI" + dni + "el dia" + fecha + "a las" + horario + "hs, " + "cantidad total de visitas que tiene: " +cantidadVisitas;

    }

    /// TO STRING
    @Override
    public String toString() {
        return "Visita{" +
                "idVisita=" + idVisita +
                ", fechaDeVisita='" + fechaDeVisita + '\'' +
                ", horarioDeVisita=" + horarioDeVisita +
                ", autorizacionVisita=" + autorizacionVisita +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cantidadVisitas=" + cantidadVisitas +
                ", legajoGuardiaACargo=" + legajoGuardiaACargo +
                '}';
    }
}
