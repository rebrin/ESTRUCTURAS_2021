package unidad.i.tda;

import java.util.ArrayList;

public class TestAlumno {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos=new ArrayList<>();
        Alumno obj=new Alumno("rebrin","Sistemas",23);
        alumnos.add(obj);
        alumnos.add(new Alumno("mayra","gestion",21));
        alumnos.add(new Alumno("valentina","gestion",18));

        //eliminar elementos
        //alumnos.remove(obj);
        //traer referencia para modificarlo
        /*Alumno modificable=alumnos.get(0);
        modificable.setEdad(37);*/
        Alumno v;
        v=alumnos.stream().filter(al->al.getNombre()=="valentina")
                        .findAny().
                orElse(null);
        v.setEdad(21);

        System.out.println(v);

    }
}
