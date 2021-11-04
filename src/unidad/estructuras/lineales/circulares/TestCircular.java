package unidad.estructuras.lineales.circulares;

public class TestCircular {
    public static void main(String[] args) {
        ListaC c= new ListaC();
        c.insertarFinal(1);
        c.insertarFinal(2);
        c.insertarFinal(3);
        c.insertarFinal(4);
        c.insertarFinal(5);
        c.imprimir();
        System.out.println(c.peek());
        System.out.println("eliminado:"+c.eliminar());
        System.out.println("eliminado:"+c.eliminar());
        c.imprimir();
    }
}
