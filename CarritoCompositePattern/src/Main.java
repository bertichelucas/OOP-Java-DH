import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Carrito carrito = new Carrito();
        Producto p1 = new ProductoIndividual("Big Mac", 300);
        Producto p2 = new ProductoIndividual("Papitas chicas", 100);
        Producto p3 = new ProductoIndividual("Papitas grandes", 150);
        Producto p4 = new ProductoIndividual("Gaseosa", 50);
        Producto p5 = new ProductoIndividual("Mac pollo", 220);


        List<Producto> productosParaElCombo = new ArrayList<>();
        productosParaElCombo.add(p1);
        productosParaElCombo.add(p2);
        productosParaElCombo.add(p4);

        Producto combo = new Combo("Combo big mac", productosParaElCombo, 0.15);

        carrito.agregarProducto(combo);
        carrito.agregarProducto(p3);

        System.out.println(carrito.calcularCostoTotal());
    }
}
