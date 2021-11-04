package unidad.estructuras.lineales.dobles;

public class Pila <T> extends ListaD<T>{

    public Pila(){
           super();//llama al constructor de la clase padre
    }

    public void push(T el){
        this.insertarFinal(el);
    }

    public T pop(){
        return eliminarFinal();
    }

    public T peek(){
        if(last!=null)
            return last.info;
        else
            return null;
    }
}
