package ejercicio1;

import java.util.ArrayList;
import java.util.List;

//Clase compuesta que representa un kit
public class Kit extends Elemento {
    private List<Elemento> elementos = new ArrayList<>();
    public Kit(int codigo) {
        super(0, codigo); //El precio se calculará dinámicamente
    }

    public void agregarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    public void eliminarElemento(Elemento elemento) {
        elementos.remove(elemento);
    }

    @Override
    public double calcularPrecio() {
        double precioTotal = 0;
        for (Elemento elemento : elementos) {
            precioTotal += elemento.calcularPrecio();
        }
        //Aplicar el descuento del 10% para los kits
        return precioTotal * 0.9;
    }
}
