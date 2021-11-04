package estrcutras.no.lineales;

public class BinTree {
    BNodo root;

    //inicializa el árbol
    public BinTree(){
        root=null;
    }

    //visitar el nodo
    public void visita(BNodo nodo){
        System.out.print(" "+nodo.key);
    }

    //busqueda, regresa nodo o null en caso de fallo
    public BNodo busca(BNodo p,int el){
        while(p!=null){
            if(el==p.key)
                return p;
            else if(el<p.key)
                p=p.left;
            else p=p.right;
        }
        return null;
    }

    public void inserta(int el){
        BNodo p=root,prev=null;
        while(p!=null){
            prev=p;
            if(el>p.key)
                p=p.right;
            else if(el<p.key)
                p=p.left;
        }
        //caso 1
        if(root==null)
            root=new BNodo(el);
        //caso 2 y 3
        else if(el>prev.key)
            prev.right=new BNodo(el);
        else
            prev.left=new BNodo(el);
    }

}
