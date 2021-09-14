package unidad.i.tda;

import java.util.HashMap;

public class TestHash {
    public static void main(String[] args) {
        //diccionario
        HashMap<String,String>dicc=new HashMap<>();
        //estos usan get y put
        dicc.put("hello","hola en ingles");
        dicc.put("bye","adios en ingles");
        dicc.put("market","mercado en ingles");

        System.out.println(dicc.get("hello"));

    }
}
