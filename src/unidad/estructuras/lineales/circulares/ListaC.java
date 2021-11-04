package unidad.estructuras.lineales.circulares;

public class ListaC {
    NodoC tail;

    public ListaC(){
        tail=null;
    }

    public boolean vacia(){
        return tail==null;
    }

    public void insertarFinal(int el){
        if(vacia()){
            tail=new NodoC(el);
            tail.next=tail;
        }else{
            tail.next=new NodoC(el,tail.next);
            tail=tail.next;
        }
    }

    public void imprimir(){
        NodoC tmp=tail.next;
        do{
            System.out.print(" "+tmp.info);
            tmp=tmp.next;
        }while(tmp!=tail.next);
        System.out.println();
    }

    public int eliminar(){
        if(!vacia()){
            NodoC tmp=tail.next;
            //caso solo 1 elemento
            if(tail==tail.next)
                return tmp.info;
            //mas de un elemento
            else{
                while(tmp.next!=tail){
                    tmp=tmp.next;
                }
                tmp.next=tail.next;
                int valor=tail.info;
                tail=tmp;
                return valor;
            }
        }else
            return Integer.MIN_VALUE;
    }

    public int peek(){
        if(tail!=null)
            return tail.info;
        else
            return Integer.MIN_VALUE;
    }
}
