package ejercicio1;

public class Main {
    public static void main(String[] args) {
        //Crear elementos simples
        Elemento elemento1 = new ElementoSimple(100, 1);
        Elemento elemento2 = new ElementoSimple(200, 2);

        //Crear un kit y agregar elementos
        Kit kit = new Kit(3);
        kit.agregarElemento(elemento1);
        kit.agregarElemento(elemento2);

    }
}
