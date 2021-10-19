package unidad.i.tda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class DatosPersistentes {
    String PathName="./datos.txt";
    File arch;
    ArrayList<Dato> ADatos=new ArrayList<>();
    //constructor
    public DatosPersistentes(){
        arch=new File(PathName);
    }

    public void escribirArchivo(){
        try{
            File fw=new File(PathName);
            Formatter f=new Formatter(fw);
            for(Dato d: ADatos){
                f.format(d.toString());
            }
            f.close();
            System.out.println("Escrito");
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerArchivo(){
        try {
            Scanner s=new Scanner(arch);
            while(s.hasNext()){
                String linea=s.nextLine();
                System.out.println(linea);
                String palabras[]=linea.split(",");
                Dato dato=new Dato(palabras[0],palabras[1]
                        ,palabras[2],Integer.parseInt(palabras[3]));
                ADatos.add(dato);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DatosPersistentes datosPersistentes=new DatosPersistentes();
        datosPersistentes.leerArchivo();
        /*escribir, eliminar, objetos*/

        datosPersistentes.ADatos.add(new Dato("ivana"
                ,"rubalcava","Herrera",13));


        /*al finalizar el programa */
        datosPersistentes.escribirArchivo();
    }
}
