package scannerTest;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int edad;
        String nombre;


        System.out.println("Ingrese su edad: ");
        edad = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingrese su nombre: ");
        nombre = lector.nextLine();

        System.out.println("Su nombre es " + nombre + " y su edad es " + edad);
    }
}
