import java.util.List;

public class Combo implements Producto{

    private String nombre;
    private List<Producto> componentesCombo;
    private double descuento;

    public Combo(String nombre, List<Producto> componentesCombo, double descuento) {
        this.nombre = nombre;
        this.componentesCombo = componentesCombo;
        this.descuento = descuento;
    }

    @Override
    public double calcularCosto() {
        double costoTotal = 0;

        for (Producto pr: this.componentesCombo){
            costoTotal += pr.calcularCosto();
        }
        costoTotal -= costoTotal * this.descuento;
        return costoTotal;
    }
}
