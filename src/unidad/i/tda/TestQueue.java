package unidad.i.tda;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
         Queue<Integer>cola=new LinkedList<>();
         ArrayList<Integer>el=new ArrayList<>();
         el.add(3);
         el.add(0);

         cola.add(1);
         cola.add(2);
         cola.add(3);
         cola.add(3);
         cola.add(3);

         cola.add(0);
        System.out.println(cola.remove());
        System.out.println(cola.toString());
        System.out.println(cola.removeAll(el));
        System.out.println(cola.toString());
    }
}
