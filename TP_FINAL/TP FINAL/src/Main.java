import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       Sistema sistema = new Sistema();

       int opcion;

       do{
           System.out.println("============================================");
           System.out.println("       SISTEMA DE CONTROL DE PRISION        ");
           System.out.println("============================================");

           System.out.println("-----------------Guardias-------------------");
           System.out.println("1. Agregar guardia comun");
           System.out.println("2. Agregar guardia armado");
           System.out.println("3. Agregar guardia capacitado en Taser");
           System.out.println("4. Mostrar todos los guardias");
           System.out.println("5. Dar descanso a un guardia");
           System.out.println("6. Mostrar guardias en servicio");
           System.out.println("7. Mostrar guardias fuera de servicio");
           System.out.println("8. Mostrar guardias fuera de servicio");
           System.out.println("9. Cambiar turno de un guardia");
           System.out.println("10.Asignar o cambiar arma a un guardia armado");
           System.out.println("11.Asignar gas pimienta a un guardia comun");
           System.out.println("12.Asignar/actualizar Taser a un guardia capacitado");

           System.out.println("-----------------Prisioneros-------------------");

           System.out.println("-----------------Celdas-------------------");
           System.out.println("13. Crear celda comun");
           System.out.println("14.Crear celda de confinamiento solitario");
           System.out.println("15.Mostrar todas las celdas");
           System.out.println("16.Asignar guardia a una celda");
           System.out.println("17.Asignar prisionero a una celda");
           System.out.println("18.Eliminar prisionero de una celda");
           System.out.println("19.Extender dias de aislamiento(confinamiento)");
           System.out.println("20.Terminar aislamiento(liberar celda solitaria)");
           System.out.println("21.Registrar inspeccion de celda");
           System.out.println("22.Mostrar celdas ocupadas");
           System.out.println("23.Mostrar celdas vacias");


           System.out.println("-----------------Archivos-------------------");
           System.out.println("Cargar datos en JSON");
           System.out.println("Guardar datos en JSON");
           System.out.println("0. Salir");
           System.out.println("Seleccione una opcion: ");

           opcion = sc.nextInt();
           sc.nextLine();

           switch (opcion){
               case 1:
                   break;
               case 2:
                   break;
               case 3:
                   break;
               case 4:
                   System.out.println("\n-----GUARDIAS-----");
                   sistema.mostrarGuardias();
                   break;
           }
       }while(opcion != 0);


    }
}