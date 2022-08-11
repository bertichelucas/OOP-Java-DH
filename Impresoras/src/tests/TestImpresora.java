package tests;

import impresora.Impresora;

import java.util.Date;

public class TestImpresora {

    public static void main(String[] args) {

        Date fecha = new Date();

        Impresora imp = new Impresora("HP-3000", "Inalambrica", fecha);

        System.out.println(imp.tieneHojas());

        imp.agregarHojas(15);
        System.out.println(imp.tieneHojas());

        System.out.println(imp);

        System.out.println(imp.getFechaFabricacion());

        System.out.println(imp.imprimir("Buenas como va?", true));

    }
}
