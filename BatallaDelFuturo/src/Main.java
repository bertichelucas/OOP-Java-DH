import sistemaArmas.*;



public class Main {

    public static void main(String[] args) {
        RobotPesado rp = new RobotPesado(1000);

        rp.atacar();
        rp.mostrar();
        rp.defender();
        rp.volar();

    }
}
