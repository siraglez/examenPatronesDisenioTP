package ejercicio1;

import java.util.ArrayList;
import java.util.List;

//Clase compuesta que representa un kit
public class Kit extends Elemento {
    private List<Elemento> elementos = new ArrayList<>();
    public Kit(double precio, int codigo) {
        super(precio, codigo);
    }

    @Override
    public double calcularPrecio() {
        return getPrecio() * 2;
    }
}
