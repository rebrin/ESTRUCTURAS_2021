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

    public int eliminaFinal(){
        if(!vacia()){
            int el=last.info;
            //primer caso
            if(first==last){
                first=last=null;
            }else{
                NodoS tmp;
                for(tmp=first;tmp.next!=last;tmp=tmp.next){}
                tmp.next=null;
                last=tmp;
            }
            return el;
        }
        return Integer.MIN_VALUE;
    }

    public int elimina(int borra){
        if(!vacia()){
            NodoS tmp=first;
            if(first==last && borra== tmp.info){
                first=last=null;
            }else{
                if(borra==first.info)
                    return borraFrente();
                else if(borra==last.info)
                    return eliminaFinal();
                else{
                    NodoS pred;
                    for(pred=tmp;
                        tmp.info!=borra && tmp!=null;
                        pred=tmp,
                        tmp=tmp.next){}
                        pred.next=tmp.next;
                        tmp.next=null;
                        return tmp.info;
                }

            }
            return Integer.MIN_VALUE;
        }else
            return Integer.MIN_VALUE;
    }
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
        System.out.println("eliminado:"+l.elimina(3));
        System.out.println();

        l.imprimeLista();
    }
}
