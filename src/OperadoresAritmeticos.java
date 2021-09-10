public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a=10;
        float b=3.0f;
        float c=a/b;
        System.out.println(c);
        //precedencia de operadores
        c=3*2*5+2+5/5;
        //3*2=6
        //6*5=30
        //5/5=1
        System.out.println(c);
    }
}
