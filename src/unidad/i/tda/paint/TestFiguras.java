package unidad.i.tda.paint;

import java.util.ArrayList;

public class TestFiguras {
    public static void main(String[] args) {
        ArrayList<Areable> Figuras=new ArrayList<>();

        Circulo c=new Circulo(0,0);
        Cuadrado cuad=new Cuadrado(0,0);
        Linea l=new Linea(0,0);

        Figuras.add(c);
        Figuras.add(cuad);


    }
}
