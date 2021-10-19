package unidad.i.tda;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class AgendaBasica {
    public static void main(String[] args) {
        HashMap<String,Contacto> agenda=new HashMap<>();
        Contacto c1=new Contacto("Rebrin","4431715755",new Date());
        Contacto c2=new Contacto("Jose","4431715755",new Date());
        Contacto c3=new Contacto("Jesus","4431715755",new Date());
        Contacto c4=new Contacto("Ivana","4431715755",new Date());
        agenda.put(c1.getNombre(),c1);
        agenda.put(c2.getNombre(),c2);
        agenda.put(c3.getNombre(),c3);
        agenda.put(c4.getNombre(),c4);

        Scanner s=new Scanner(System.in);
        String comando="";
        System.out.println("Introduce el contacto a buscar:>");
        while (!comando.equals("s")){
            comando=s.nextLine();
            if(agenda.get(comando)!=null){
                System.out.println("contacto");
                System.out.println(agenda.get(comando));
            }else{
                System.out.println("no hay ningún contacto con ese nombre");
                System.out.println("presiona s para salir");
            }
            System.out.println("?> introduce el contacto a buscar");
        }
    }
}
