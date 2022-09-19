import classes.Reparacion;


public class Main {

    public static void main(String[] args) {

        Reparacion batidora = new Reparacion("Batidora");

        try {
            System.out.println(batidora);
            batidora.valorPresupuesto(100);
            batidora.siguienteEstado();
            batidora.agregarRepuesto(25);
            batidora.siguienteEstado();
            batidora.cambiarDireccion("Cordoba");
            batidora.siguienteEstado();
            batidora.siguienteEstado();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
