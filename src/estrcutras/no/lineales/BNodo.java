package estrcutras.no.lineales;

public class BNodo {
    BNodo left,right;
    int key;
    //const1
    public BNodo(){
        left=right=null;
    }
    //const2
    public BNodo(int k){
        this(k,null,null);
    }
    //const3
    public BNodo(int k,BNodo l,BNodo r){
        key=k;
        left=l;
        right=r;
    }

}
