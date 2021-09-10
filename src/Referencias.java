public class Referencias {
    /*atributos*/
    int operadorEntero;
    String nom;
    //constructor
    public Referencias(int oen, String n){
        operadorEntero=oen;
        nom=n;
    }

    @Override
    public String toString() {
        return "\nReferencias{" +
                "operadorEntero=" + operadorEntero +
                ", nom='" + nom + '\'' +
                '}';
    }

}
