package unidad.i.tda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;


public class TestListVsSet {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        HashSet<Integer> treeSet=new HashSet<>();
        Random r= new Random();
        int numAl=r.nextInt(10);
        for (int i = 0; i < 20; i++) {
            arrayList.add(numAl);
            treeSet.add(numAl);
            numAl=r.nextInt(10);
        }

        System.out.println(arrayList.toString());
        System.out.println(treeSet.toString());
    }
}
