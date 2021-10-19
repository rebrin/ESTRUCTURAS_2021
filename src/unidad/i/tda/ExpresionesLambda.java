package unidad.i.tda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExpresionesLambda {
    public static void main(String[] args) {

        ArrayList<Integer>enteros=new ArrayList<Integer>();
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);

        enteros.forEach(num-> System.out.println(num));

        //fuente
        ArrayList<Integer> cuadrados=
                (ArrayList<Integer>) enteros.stream()
                        .map(x->x*x)
                        .collect(Collectors.toList());

        System.out.println(cuadrados.toString());

        //sacar los pares
        ArrayList<Integer> pares=
                (ArrayList<Integer>) enteros.stream()
                        .filter(n->n%2==0)
                        .collect(Collectors.toList());
        System.out.println(pares.toString());

        //persistente
        String path="./numeros.txt";
        File f=new File(path);
        try {
            ArrayList<Integer>enteros2=new ArrayList<Integer>();
            enteros2.add(1);
            enteros2.add(2);
            enteros2.add(3);
            enteros2.add(4);
            enteros2.add(5);
            Formatter formatter=new Formatter(f);
            enteros2.stream()
                    .filter(n->n>3)
                    .forEach(el-> formatter.format(el.toString()+"\n"));
            formatter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
