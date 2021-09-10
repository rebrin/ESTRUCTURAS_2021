package unidad.i.tda;

public class TestAlumnno {
    public static void main(String[] args) {
        Alumno a1=new Alumno("rebrin","sistemas",37);
        Alumno a2=new Alumno("Alexa","sistemas",20);
        Alumno a3=new Alumno("Ivana","sistemas",18);
        Alumno a4=new Alumno("Valentina","sistemas",17);
        //arreglo de objetos
        Alumno [] alumnos={a1,a2,a3,a4};
        //forma 2 de usar un arreglo de objetos
        Alumno [] alumnos2=new Alumno[5];
        alumnos2[0]=a1;
        alumnos2[1]=a2;
        alumnos2[2]=a3;
        alumnos2[3]=a4;
        alumnos2[4]=a4;
        //alumnos2=new Alumno[7];

        //recorrer arreglos o colecciones
        for(Alumno a:alumnos2){
            System.out.println(a);
        }
        System.out.println();
        //for común
        for (int i = 0; i < alumnos2.length; i++) {
            System.out.println(alumnos2[i]);
        }

    }
}
