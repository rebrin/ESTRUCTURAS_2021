package unidad.i.tda;

public class EjercicioArreglos {
    public static void main(String[] args) {
        int array[]= new int[10];
        //iniciar en 2
        //le van a multiplicar por 2 al contador sin saobrepasar
        //mostrar el arreglo
        array[0]=2;
        for (int i = 1; i < array.length; i++) {
            array[i]=array[i-1]*2;
        }
        for (int el:array){
            System.out.println(el);
        }

    }
}
