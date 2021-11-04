package unidad.estructuras.lineales.dobles;

public class TestCola {
    public static void main(String[] args) {
        Cola<Integer> c=new Cola<>();
        c.queue(5);
        c.queue(7);
        c.queue(11);
        c.queue(13);
        c.queue(17);
        c.imprime();
        System.out.println(c.deQueue());
        c.imprime();
    }
}
