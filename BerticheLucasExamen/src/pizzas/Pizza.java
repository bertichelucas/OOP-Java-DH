package pizzas;

public abstract class Pizza {

    private String nombre, descripcion;

    public Pizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularPrecio();

    @Override
    public String toString() {
        return "Pizza{" +
                "nombre= " + this.getNombre() +
                ", precio= " + this.calcularPrecio() +
                '}';
    }

}
