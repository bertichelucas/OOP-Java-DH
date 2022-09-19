public class ProductoIndividual implements Producto{

    private String name;
    private double precio;

    public ProductoIndividual(String name, double precio) {
        this.name = name;
        this.precio = precio;
    }

    @Override
    public double calcularCosto() {
        return this.precio;
    }
}
