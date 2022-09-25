package pizzas;

public class PizzaSimple extends  Pizza{

    private double precio;
    private boolean esGrande;

    public PizzaSimple(String nombre, String descripcion, double precio, boolean esGrande) {
        super(nombre, descripcion);
        this.precio = precio;
        this.esGrande = esGrande;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEsGrande(boolean esGrande) {
        this.esGrande = esGrande;
    }

    @Override
    public double calcularPrecio() {
        if(this.esGrande){
            return this.precio * 2;
        }
        return this.precio;
    }


}
