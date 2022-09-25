package pizzas;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private String nombre;
    private List<Pizza> listaPizzasALaVenta;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        this.listaPizzasALaVenta = new ArrayList<>();
    }

    public void agregarPizza(Pizza pizza){
        this.listaPizzasALaVenta.add(pizza);
    }

    public String mostrarPizzas(){
        String resumenPizzas = "Pizzas que ofrecemos:\n";
        for (Pizza pizza: this.listaPizzasALaVenta) {
            resumenPizzas += pizza.toString() + '\n';
        }
        return resumenPizzas;
    }
}
