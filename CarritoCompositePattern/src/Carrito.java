import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> productoList;

    public Carrito(){
        this.productoList = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        this.productoList.add(producto);
    }

    public double calcularCostoTotal(){
        double costoTotal = 0;

        for (Producto pr: this.productoList){
            costoTotal += pr.calcularCosto();
        }
        return costoTotal;
    }

}
