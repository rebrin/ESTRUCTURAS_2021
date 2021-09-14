package unidad.i.tda;

import java.util.Arrays;

public class TestClone {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
        //un clon es una instancia identica
        int [] b=array.clone();
        //referencias solo si no es clon
        b[2]=9;
        //Arrays es una clase utilitaria
        Arrays.sort(b);
        //buscar un valor en un arreglo regresa la pos y si no -
        System.out.println(Arrays.binarySearch(b,7));
        System.out.println("array A"+Arrays.toString(array));
        System.out.println(Arrays.toString(b));

    }
}
