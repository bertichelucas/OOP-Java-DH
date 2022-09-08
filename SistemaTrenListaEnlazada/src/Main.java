import clases.EmpresaTrenes;

public class Main {

    public static void main(String[] args) {
        String[] listaEstaciones = {"Buenos Aires", "Lujan", "Mercedes", "Suipacha", "Chivilcoy", "Alberti", "Bragado"};
        EmpresaTrenes empresa = new EmpresaTrenes("Trenes Locos", listaEstaciones);


        empresa.mostrarEstaciones();
        empresa.generarReserva("Lujan", "Suipacha", 2);

        System.out.println(empresa.recaudacionTotal());
        System.out.println(empresa.cantVecesRecorrida("Buenos Aires"));

        empresa.agregarEstacion("Lanus", 7);
        empresa.mostrarEstaciones();

        empresa.generarReserva("Buenos Aires", "Lanus", 2);
        System.out.println(empresa.recaudacionTotal());
        System.out.println("Cant veces que se pasa por BS AS: " + empresa.cantVecesRecorrida("Buenos Aires"));
        System.out.println("Cant veces que se pasa por Lujan: " + empresa.cantVecesRecorrida("Lujan"));

    }
}
