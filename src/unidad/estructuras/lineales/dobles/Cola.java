package unidad.estructuras.lineales.dobles;

public class Cola <T> extends ListaD<T>{
    public Cola(){
        super();
    }

    public void queue(T el){
        insertarFrente(el);
    }

    public T deQueue(){
        return eliminarFinal();
    }

    public T peek(){
        if(last!=null)
            return last.info;
        else return null;
    }
}
