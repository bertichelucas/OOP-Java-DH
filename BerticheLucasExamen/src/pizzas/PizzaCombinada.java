package pizzas;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{

    private List<Pizza> listaPizzas;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.listaPizzas = new ArrayList<>();
    }


    public void agregarPizza(Pizza pizza){
        this.listaPizzas.add(pizza);
    }

    @Override
    public double calcularPrecio() {
        double precioTotal = 0;
        for (Pizza pizza: listaPizzas) {
            precioTotal += pizza.calcularPrecio();
        }
        return precioTotal / this.listaPizzas.size();
    }


}
