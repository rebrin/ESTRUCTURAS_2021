package unidad.recursividad;
import java.util.Scanner;

public class Factorial {

    public Factorial(){
        Scanner s=new Scanner(System.in);
        System.out.println("introduce N: ");
        Long n=s.nextLong();
        long res=fact(n);
        System.out.println("Resultado:" +res);
    }

    public Long fact(long n){
        /*caso base*/
        if(n==0 || n==1){
            return 1l;
        }else {
            /* llamada recursiva n *(n-1)!  */
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        Factorial f=new Factorial();
    }
}
