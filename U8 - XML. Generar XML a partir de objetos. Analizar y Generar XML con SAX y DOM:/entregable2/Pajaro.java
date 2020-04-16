package tema8.entregable2;

public class Pajaro {
    private String nombre;
    private int edad;
    private double peso;
    private String tipo;

    public Pajaro(String nombre, int edad, double peso,String tipo ) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;

            this.tipo=tipo;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pajaro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
