public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();

        Producto p1 = new Producto("Pan", 150);
        Producto p2 = new Producto("Harina", 300);

        carrito.agregarProducto(p1);

        System.out.println(carrito.getEstado().getClass());

        carrito.agregarProducto(p2);
        carrito.pasarSiguienteEstado();
        System.out.println(carrito.getEstado().getClass());

        carrito.pasarSiguienteEstado();

    }
}