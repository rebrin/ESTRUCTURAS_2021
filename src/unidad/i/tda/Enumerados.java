package unidad.i.tda;

public class Enumerados {
    enum Dias{DOMINGO,LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO};

    public static void main(String[] args) {
        Dias d=Dias.MARTES;
        System.out.println(d);
        if(d==Dias.valueOf("MARTES"))
            System.out.println("si es martes");

    }
}
