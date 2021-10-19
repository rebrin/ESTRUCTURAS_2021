package unidad.recursividad;
import java.util.Scanner;

public class TrianguloPascal {
    public TrianguloPascal(){
        Scanner s=new Scanner(System.in);
        System.out.println("cuantas filas ?");
        int filas=s.nextInt();
       for(int i=0;i<filas;i++){
           for(int j=0;j<=i;j++){
               System.out.print(" "+tPascal(i,j));
           }
           System.out.println();
       }
    }

    public int tPascal(int f, int c){
        //caso base
        if(c==0 || c==f)
            return 1;
        else
            return tPascal(f-1,c-1)+tPascal(f-1,c);
    }

    public static void main(String[] args) {
        new TrianguloPascal();
    }
}
