package unidad.estructuras.lineales.dobles;

public class TestPila {
    public static void main(String[] args) {
        Pila<Integer> pila=new Pila<>();
        pila.push(5);
        pila.push(7);
        pila.push(11);
        pila.push(13);
        pila.imprime();
        System.out.println(pila.pop());
        pila.imprime();
    }
}
