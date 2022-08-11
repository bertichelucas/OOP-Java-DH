package comidaPerros;

import java.util.Scanner;

public class ComidaPerros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        double cantidadComida;

        System.out.println("Ingrese el nombre del perro: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese la cantidad de comida en kg");
        cantidadComida = scanner.nextDouble();
        while (cantidadComida < 3){
            System.out.println("Recorda que el perro come más de 3kg, ingresa nuevamente: ");
            cantidadComida = scanner.nextDouble();
        }

        System.out.println("La cantidad de paquetes para: " + nombre + " es: " +  cuantosPaquetes(cantidadComida));
    }

    public static double cuantosPaquetes(double cantidadComida){

        Scanner scanner = new Scanner(System.in);

        double pesoTotalPaquetes = 0;
        double cantPaquetes = 0;

        while (pesoTotalPaquetes < cantidadComida){
            System.out.println("Ingrese peso del paquete: ");
            pesoTotalPaquetes += scanner.nextDouble();
            cantPaquetes += 1;
        }
        return cantPaquetes;
    }

}
