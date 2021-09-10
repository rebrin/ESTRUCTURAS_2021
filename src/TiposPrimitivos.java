import java.util.*;
public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int v=127;
        v+=10;
        System.out.println(v);
        //secuencias de escape
        System.out.println("esto es un mensaje \n esto es otro");
        System.out.println("esto es un mensaje \\n esto es otro\"");
        System.out.println("\"esto es un mensaje\"");
        System.out.println("introduce una variable");
        v=s.nextShort();
        System.out.println(v);
    }
}
