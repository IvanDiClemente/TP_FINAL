import Guards.Guardia;
import Prisoners.Prisionero;
import Rooms.Celda;

import java.util.HashMap;
import java.util.List;

public class Sistema {
    private Manager<Guardia> registroGuardias;
    private Manager<Prisionero> registroPrisioneros;
    private HashMap<Integer ,Celda> listaCeldas;

    //Guardias
    public void agregarGuardia (Guardia g){
        if (!registroGuardias.existe(g.getDni())){

        }
    }

    public void mostrarGuardias (){
        try{
            registroGuardias.mostrar();
        }catch (Exception e){
            System.out.println("Error al mostrar guardias: " +  e.getMessage());
        }
    }

}
