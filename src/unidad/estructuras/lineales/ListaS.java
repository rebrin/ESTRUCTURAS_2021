package unidad.estructuras.lineales;

public class ListaS {

    NodoS first,last;

    public ListaS(){
        first=last=null;
    }

    public boolean vacia(){
        return first==null;
    }

    public void insFrente(int info){
        if(vacia())
            first=last=new NodoS(info,null);
        else{
            first=new NodoS(info,first);
        }
    }

    public void insFinal(int info){
        if(vacia())
            first=last=new NodoS(info);
        else {
            last.next = new NodoS(info);
            last=last.next;
        }

    }

    public int borraFrente(){
        if(!vacia()){
            NodoS tmp= first;
            if(first==last)//caso 2
            {
                first=last=null;
            }else{
                first=first.next;
                tmp.next=null;
            }
            return tmp.info;
        }
        return -1;
    }//

    public void imprimeLista(){
        for(NodoS tmp=first;tmp!=null;tmp=tmp.next)
            System.out.print(tmp.info+" ");
    }//imprime lista

    public boolean enLista(int el){
        NodoS tmp;
        for(tmp=first;tmp!=null&&tmp.info!=el;tmp=tmp.next);
        return tmp!=null;
    }

    public static void main(String[] args) {
        ListaS l=new ListaS();
        l.insFinal(13);
        l.insFinal(23);
        l.insFinal(1);
        l.insFinal(3);
        l.insFinal(1);
        l.imprimeLista();
        System.out.println();
        System.out.println(l.enLista(17));
    }
}
