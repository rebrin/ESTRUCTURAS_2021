package unidad.i.tda;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class TestFiles {
   String PathName="./nombres.txt";
    File arch;
    //constructor
    public TestFiles(){
        arch=new File(PathName);
    }

    public void escribirArchivo(){
        try{
            //fileWritter para modo de apertura Append
            FileWriter fw=new FileWriter(PathName,true);
            Formatter f=new Formatter(fw);
            f.format("valentina\n");
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
            //scanner para leer un flujo de lectura
            Scanner s=new Scanner(arch);
            while(s.hasNext()){
                System.out.println(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestFiles t=new TestFiles();
        t.escribirArchivo();
    }
}
