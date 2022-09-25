package factorypizzas;

import pizzas.Pizza;
import pizzas.PizzaCombinada;
import pizzas.PizzaSimple;

public class FactoryPizza {

    private static FactoryPizza instance;

    public static final String PIZZA_SIMPLE = "PizzaSimple";
    public static final String PIZZA_COMBINADA = "PizzaCombinada";


    private FactoryPizza(){

    }

    public static FactoryPizza getInstance() {
        if(instance == null){
            instance = new FactoryPizza();
        }
        return instance;
    }

    public Pizza crearPizza(String codigo, String nombre){
        switch (codigo){
            case PIZZA_SIMPLE:
                return new PizzaSimple(nombre, "", 0, false);
            case PIZZA_COMBINADA:
                return new PizzaCombinada(nombre, "");
            default:
                return null;
        }
    }
}
