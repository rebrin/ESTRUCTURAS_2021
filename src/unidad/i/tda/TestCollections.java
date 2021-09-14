package unidad.i.tda;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        ArrayList<Integer> enteros=new ArrayList<Integer>();
        LinkedList<Integer> listaEnteros=new LinkedList<>();
        Vector<Integer> vector=new Vector<>();

        vector.add(120);
        enteros.add(153);
        listaEnteros.add(789);
        //crear aleatoriamente
        Scanner s=new Scanner(System.in);
        Random r= new Random();

        System.out.println("cuantos elementos necesitas");
        int cuantos=s.nextInt();
        for (int i = 0; i < cuantos; i++) {
            vector.add(r.nextInt(10));
            enteros.add(r.nextInt(10));
            listaEnteros.add(r.nextInt(10));
        }
        System.out.println(vector.toString());
        System.out.println(enteros.toString());
        System.out.println(listaEnteros.toString());
    }
}
