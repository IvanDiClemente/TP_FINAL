import Excepciones.AccionInvalidaEx;
import Prisoners.Prisionero;
import Guards.Guardia;

import java.util.HashMap;

public class Manager <T>{
    private HashMap<String, T> lista;

    public Manager() {
        this.lista = new HashMap<>();
    }

    public void agregar (String clave, T elemento)throws AccionInvalidaEx {
        if (this.lista.containsKey(clave)){
            throw new AccionInvalidaEx("Ya existe ese elemento");
        }
        this.lista.put(clave,elemento);
    }

    public void eliminar (String clave)throws AccionInvalidaEx {
        if(this.lista.containsKey(clave)){
            throw new AccionInvalidaEx("No existe ese elemento");
        }
        this.lista.remove(clave);
    }

    public boolean existe (String clave) {
        return this.lista.containsKey(clave);
    }

    public T obtener (String clave) {
        return this.lista.get(clave);
    }

    public void mostrar(){
        for (T elem :  this.lista.values()){
            System.out.println(elem);
        }
    }

    @Override
    public String toString() {
        return "Manager{" +
                "lista=" + lista +
                '}';
    }
}
