package unidad.estructuras.lineales;

public class NodoS {

    int info; //informacion de la lista
    NodoS next;

    public NodoS(int info){
        this(info,null); //hace un llamado al segundo constructor
    }

    public NodoS(int info, NodoS ref){
        this.info=info;
        next=ref;
    }

}
