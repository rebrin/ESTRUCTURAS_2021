import java.util.Locale;

public class TestReferencias {
    public static void main(String[] args) {
       //instancia
        Referencias ref1=new Referencias(13,"rebrin");
        Referencias ref2;
        //referencia
        ref2=ref1;
        ref2.nom=ref2.nom.toUpperCase();

        System.out.println(ref1);

    }
}
