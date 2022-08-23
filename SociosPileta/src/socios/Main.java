package socios;

public class Main {

    public static void main(String[] args) {
        Socio socio = new Socio("1","juancito", 1500,"funcional");

        System.out.println(socio);

        SocioPileta sp = new SocioPileta("2", "Damian", 1500,"Natacion", 500, true);

        System.out.println(sp);
        System.out.println(sp.calcularCostoMensual());
    }
}
