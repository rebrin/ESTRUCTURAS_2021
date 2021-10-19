package unidad.i.tda;

import java.util.ArrayList;
import java.util.Comparator;

public class TestOrdenamientos {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos=new ArrayList<>();
        alumnos.add(new Alumno("Rebrindanard","Sistemas",37));
        alumnos.add(new Alumno("Steve","Sistemas",
                40));
        alumnos.add(new Alumno("José","Administración",
                27));
        alumnos.add(new Alumno("Ivana","Administración",
                29));

        alumnos.sort(new Comparator<Alumno>() {
                         @Override
                         public int compare(Alumno o1, Alumno o2) {
                             return o2.getEdad()-o1.getEdad();
                         }
                     }
        );
        System.out.println(alumnos.toString());

    }
}
