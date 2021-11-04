package unidad.estructuras.lineales.circulares;

public class NodoC {

    int info;
    NodoC next;

    public NodoC(int el, NodoC N){
        info=el;
        next=N;
    }

    public NodoC(int el){
        this(el,null);
    }
}
