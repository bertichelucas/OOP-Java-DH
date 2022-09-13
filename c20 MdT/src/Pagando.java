public class Pagando  implements StateCarrito{

    private Carrito carrito1;

    public Pagando(Carrito carrito1) {
        this.carrito1 = carrito1;
    }
    @Override
    public void agregarProducto(Producto producto1) {

    }

    @Override
    public void vaciarCarrito() {
        this.carrito1.getConjuntoProductos().removeAll( this.carrito1.getConjuntoProductos());
    }

    @Override
    public void volverPuntoAnterior() {
        this.carrito1.setEstado(new Cargando(this.carrito1));
    }

    @Override
    public void pasarSiguienteEstado() {
        double total = 0;
        for (Producto producto: this.carrito1.getConjuntoProductos()) {
            total += producto.getPrecio();
        }

        this.vaciarCarrito();

        System.out.println("Pagaste: " + total);
        this.carrito1.setEstado(new Cargando(this.carrito1));
    }
}
