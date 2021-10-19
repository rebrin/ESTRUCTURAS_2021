package unidad.recursividad;

public class Mcd {
    public Mcd(double a,double b){
        System.out.println(mcd(a,b));
    }

    public double mcd(double a, double b){
        if(b==0)
            return a;
        else
            return mcd(b,a%b);
    }

    public static void main(String[] args) {
        new Mcd(2366,273);
    }
}
