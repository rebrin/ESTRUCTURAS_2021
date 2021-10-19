package unidad.i.tda;

public class Producto {
    //*----------Atributos--------------*/
    private String id_prod;
    private String descripcion;
    private Integer existencias;
    private Float precio_venta;
    private Float precio_compra;

    //------------------------------
    public Producto(String id_producto,String descripcion,
                    int existencias,float precio_venta
            ,float precio_compra){
        System.out.println("ejecutando constructor 1");
        id_prod=id_producto;
        this.descripcion=descripcion;
        this.existencias=existencias;
        this.precio_venta=precio_venta;
        this.precio_compra=precio_compra;
    }
    //-------- constructor sobrecargado
    public Producto(String id_prod, String descripcion, Float precio_venta, Float precio_compra) {
        System.out.println("constructor 2");
        this.id_prod = id_prod;
        this.descripcion = descripcion;
        this.precio_venta = precio_venta;
        this.precio_compra = precio_compra;
        this.existencias=10;
    }

    //-----------------------------
    public boolean vender(){
        existencias--;
        return true;
    }

    public boolean vender(int cantidad){
        existencias=existencias-cantidad;
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id_prod='" + id_prod + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", existencias=" + existencias +
                ", precio_venta=" + precio_venta +
                ", precio_compra=" + precio_compra +
                '}';
    }

    public String getId_prod() {
        return id_prod;
    }

    public void setId_prod(String id_prod) {
        this.id_prod = id_prod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getExistencias() {
        return existencias;
    }

    public void setExistencias(Integer existencias) {
        this.existencias = existencias;
    }

    public Float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(Float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public Float getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(Float precio_compra) {
        this.precio_compra = precio_compra;
    }
}
