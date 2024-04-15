package Tests;

import java.util.ArrayList;
import java.util.List;

public class Tests {
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
    public class ElementoSimple extends ejercicio1.Elemento {
        public ElementoSimple(double precio, int codigo) {
            super(precio, codigo);
        }

        @Override
        public double calcularPrecio() {
            return getPrecio();
        }
    }
    public class Kit extends ejercicio1.Elemento {
        private List<ejercicio1.Elemento> elementos = new ArrayList<>();
        public Kit(int codigo) {
            super(0, codigo); //El precio se calculará dinámicamente
        }

        public void agregarElemento(ejercicio1.Elemento elemento) {
            elementos.add(elemento);
        }

        public void eliminarElemento(ejercicio1.Elemento elemento) {
            elementos.remove(elemento);
        }

        @Override
        public double calcularPrecio() {
            double precioTotal = 0;
            for (ejercicio1.Elemento elemento : elementos) {
                precioTotal += elemento.calcularPrecio();
            }
            //Aplicar el descuento del 10% para los kits
            return precioTotal * 0.9;
        }
    }
    public class Main {
        public static void main(String[] args) {
            //Crear elementos simples
            ejercicio1.Elemento elemento1 = new ejercicio1.ElementoSimple(100, 1);
            ejercicio1.Elemento elemento2 = new ejercicio1.ElementoSimple(200, 2);

            //Crear un kit y agregar elementos
            ejercicio1.Kit kit = new ejercicio1.Kit(3);
            kit.agregarElemento(elemento1);
            kit.agregarElemento(elemento2);

            //Calcular y mostrar el precio del kit
            System.out.println("Precio del kit: $" + kit.calcularPrecio());
        }
    }

}
