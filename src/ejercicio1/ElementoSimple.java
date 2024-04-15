package ejercicio1;

//Clase que representa un elemento simple
public class ElementoSimple extends Elemento {
    public ElementoSimple(double precio, int codigo) {
        super(precio, codigo);
    }

    @Override
    public double calcularPrecio() {
        return getPrecio();
    }
}
