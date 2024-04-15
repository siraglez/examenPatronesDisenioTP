package ejercicio1;

//Clase base para los elementos
public abstract class Elemento {
    protected double precio;
    protected int codigo;

    public Elemento(double precio, int codigo) {
        this.precio = precio;
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public abstract double calcularPrecio();
}
