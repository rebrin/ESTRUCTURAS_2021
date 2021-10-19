package unidad.i.tda;

import java.util.Date;

public class Contacto {
    private String nombre;
    private String tel;
    private Date fecha_nac;

    public Contacto(String nombre, String tel, Date fecha_nac) {
        this.nombre = nombre;
        this.tel = tel;
        this.fecha_nac = fecha_nac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", fecha_nac=" + fecha_nac +
                '}';
    }
}
