package unidad.i.tda;

import java.util.ArrayList;

public class TestProducto {
    public static void main(String[] args) {
        Producto Prod1=new Producto("1123"
                ,"sabritas",100,
                14.00f,10.00f);

        Producto p2=new Producto("1254"
                ,"Coca cola",
                13.0f,15.50f);

        ProductoFino p3= new ProductoFino("4563","Moet champagne"
                ,1200,1000f,900f,"moet");

        ArrayList<Producto> productos=new ArrayList<>();
        productos.add(p3);
        productos.add(Prod1);
        productos.add(p2);

        productos.stream().forEach(System.out::println);

        Producto champ=productos.get(2);

    }
}
