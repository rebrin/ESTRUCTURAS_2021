package unidad.recursividad;
import java.util.Scanner;
public class PotenciaRec {
    public PotenciaRec(){
        Scanner s=new Scanner(System.in);
        System.out.println("¿qué número deseas elevar?");
        double num=s.nextDouble();
        System.out.println("¿a qué potencia?");
        double pot=s.nextDouble();
        System.out.println(potencia(num,pot));

    }

    public double potencia(double n, double p){
        /*casos base*/
        if(p>=0) {
            if (p == 0)
                return 1;
            if (p == 1)
                return n;
            else
                return n * potencia(n, p - 1);
        }else
            return Double.MIN_VALUE;
    }

    public static void main(String[] args) {
        new PotenciaRec();
    }
}
