package unidad.recursividad;
import java.util.Scanner;

public class Fibonacci {
    long tabla[];
    public Fibonacci(){
        Scanner s=new Scanner(System.in);
        System.out.println("numero fibonacci?:");
        Long num=s.nextLong();
        tabla=new long[num.intValue()+1];
        System.out.println(fib(num));
    }

    public long fib(long n){
        tabla[0]=0;
        tabla[1]=1;
        if(n==0)
            return tabla[0];
        if(n==1)
            return tabla[1];
        else{
            if(tabla[(int)n]==0)
                tabla[(int)n]=fib(n-1)+fib(n-2);
            return tabla[(int)n];
        }
    }

    public void displayFib(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i)+" ");
        }
    }
    public static void main(String[] args) {
        Fibonacci obj=new Fibonacci();
        //obj.displayFib(10);
    }
}
