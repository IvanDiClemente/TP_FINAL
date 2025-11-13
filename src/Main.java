//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /// PRESO
        /// creacion de un preso x
        Preso preso = new Preso("Manuel", "20-12-2025", 134, CrimenCometido.HOMICIDIO, Seguridad.ALTA);

        /// llamar a los metodos y mostrar resultados
        System.out.println(preso.cumplirCondena());
        System.out.println(preso.agregarDelito(CrimenCometido.HOMICIDIO));
        System.out.println(preso.solicitarVisita("Valentina"));
        System.out.println(preso.asignarCelda(134));

      /// VISITA
        // Crear una visita
        Visita visita1 = new Visita(1, "44555888", "María López", 1234);

        // Asignar fecha y horario de visita
        System.out.println(visita1.asignarFecha("2025-11-05", 16));


    }
}