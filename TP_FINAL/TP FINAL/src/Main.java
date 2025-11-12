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

                   break;
           }
       }while(opcion != 0);


    }
}