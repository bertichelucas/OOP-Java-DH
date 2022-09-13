public class Vacio implements StateCarrito{

    private Carrito carrito1;

    public Vacio(Carrito carrito1) {
        this.carrito1 = carrito1;
    }

    @Override
    public void agregarProducto(Producto producto) {
        this.carrito1.getConjuntoProductos().add(producto);
        this.pasarSiguienteEstado();
    }

    @Override
    public void vaciarCarrito() {
        System.out.println("El carrito ya esta vacio");
    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("No hay punto anterior");
    }

    @Override
    public void pasarSiguienteEstado() {
        this.carrito1.setEstado(new Cargando(this.carrito1));
    }


}
