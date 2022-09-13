public class Cargando  implements StateCarrito{

    private Carrito carrito1;

    public Cargando(Carrito carrito1) {
        this.carrito1 = carrito1;
    }

    @Override
    public void agregarProducto(Producto producto) {
        this.carrito1.getConjuntoProductos().add(producto);
    }

    @Override
    public void vaciarCarrito() {
        this.carrito1.getConjuntoProductos().removeAll( this.carrito1.getConjuntoProductos());
        this.carrito1.setEstado(new Vacio(this.carrito1));
    }

    @Override
    public void volverPuntoAnterior() {
        this.vaciarCarrito();
    }

    @Override
    public void pasarSiguienteEstado() {
        this.carrito1.setEstado(new Pagando(carrito1));
    }
}
