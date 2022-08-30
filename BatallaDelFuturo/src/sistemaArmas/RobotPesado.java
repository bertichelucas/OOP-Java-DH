package sistemaArmas;

public class RobotPesado extends SistemaArmas implements Volador, Atacar, Defender{


    public RobotPesado(int energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("Yo ataco");
    }

    @Override
    public void defender() {
        System.out.println("Yo defiendo");
    }

    @Override
    public void mostrar() {
        System.out.println("energia: " + this.getEnergia());
    }

    @Override
    public void volar() {
        System.out.println("Yo vuelo");
    }

}
