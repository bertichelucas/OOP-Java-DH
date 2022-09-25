import factorypizzas.FactoryPizza;
import pizzas.Pizza;
import pizzas.PizzaCombinada;
import pizzas.PizzaSimple;
import pizzas.Pizzeria;

public class Test {

    public static void main(String[] args) {

        FactoryPizza factory = FactoryPizza.getInstance();

        System.out.println("********************** CREACION DE LAS PIZZAS MEDIANTE EL FACTORY **********************");

        //Creo pizza de muzzarella chica
        Pizza muzza = factory.crearPizza(FactoryPizza.PIZZA_SIMPLE, "Muzza");
        ((PizzaSimple)muzza).setPrecio(700);
        System.out.println(muzza);

        //Creo pizza especial chica
        Pizza especial = factory.crearPizza(FactoryPizza.PIZZA_SIMPLE, "Especial");
        ((PizzaSimple)especial).setPrecio(850);
        System.out.println(especial);

        //Creo pizza de anana chica
        Pizza anana = factory.crearPizza(FactoryPizza.PIZZA_SIMPLE, "Anana");
        ((PizzaSimple)anana).setPrecio(950);
        System.out.println(anana);

        //Creo combinada loca mitad especial mitad anana
        Pizza combinada = factory.crearPizza(FactoryPizza.PIZZA_COMBINADA, "Combinada loca");
        ((PizzaCombinada)combinada).agregarPizza(especial);
        ((PizzaCombinada)combinada).agregarPizza(anana);
        System.out.println(combinada);

        System.out.println("********************** CAMBIO A GRANDE LA DE MUZZA VERIFICANDO PRECIO **********************");

        //Hago grande la de muzza para verificar calculo de precio
        ((PizzaSimple)muzza).setEsGrande(true);
        System.out.println(muzza);



        System.out.println("********************** CREACION DE PIZZERIA Y PRUEBA DE MOSTRAR PIZZAS **********************");
        //Creo la pizzeria y agrego las pizzas. Para luego mostrar un informe de todas las vendidas
        Pizzeria pizzeria = new Pizzeria("Pizza Loca");
        pizzeria.agregarPizza(muzza);
        pizzeria.agregarPizza(especial);
        pizzeria.agregarPizza(anana);
        pizzeria.agregarPizza(combinada);
        System.out.println(pizzeria.mostrarPizzas());

    }



}
