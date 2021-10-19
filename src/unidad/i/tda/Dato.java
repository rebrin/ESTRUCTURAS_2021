package unidad.i.tda;

public class Dato {
    String nombre;
    String APaterno;
    String AMaterno;
    Integer edad;

    public Dato(String nombre, String APaterno, String AMaterno, Integer edad) {
        this.nombre = nombre;
        this.APaterno = APaterno;
        this.AMaterno = AMaterno;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return ""+nombre + ',' +
                 APaterno + ',' +
                 AMaterno + ',' +
                 edad +'\n';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAPaterno() {
        return APaterno;
    }

    public void setAPaterno(String APaterno) {
        this.APaterno = APaterno;
    }

    public String getAMaterno() {
        return AMaterno;
    }

    public void setAMaterno(String AMaterno) {
        this.AMaterno = AMaterno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
