package unidad.recursividad;

public class THannoi {

    int pasos;
    public THannoi(int discos){
        pasos=0;
        //comenzar el llamado recursivo
        hannoi(discos,1,2,3);
    }

    //funcion recursiva hannoi
    public void hannoi(int discos,int origen,int aux, int destino){
        //caso base
        if(discos==1){
            System.out.println("mover de torre "+origen+" a "+destino);
            pasos++;
            }
        else{//caso recursivo
            hannoi(discos-1,origen,destino,aux);
            System.out.println("mover de torre "+origen+" a "+destino);
            hannoi(discos-1,aux,origen,destino);
            pasos++;
        }
    }

    public static void main(String[] args) {
        THannoi t=new THannoi(3);
        System.out.println(t.pasos);
    }
}
