package unidad.i.tda;

public class ProductoFino extends Producto{
    String Marca;

    public ProductoFino(String id_producto,
                        String descripcion,
                        int existencias,
                        float precio_venta,
                        float precio_compra,
                        String Marca) {
        super(id_producto, descripcion, existencias, precio_venta, precio_compra);
        this.Marca=Marca;
    }

    public ProductoFino(String id_prod, String descripcion,
                        Float precio_venta, Float precio_compra
            ,String Marca ) {
        super(id_prod, descripcion, precio_venta, precio_compra);
        this.Marca=Marca;
    }

    public float iva(){
        System.out.println(getPrecio_venta()*1.16);
        return getPrecio_venta()*0.16f;
    }

    @Override
    public String toString() {
        return "ProductoFino{" +
                "existencias"+getExistencias()+' '+
                "Marca='" + Marca + '\'' +
                '}';
    }
}
