package bancosistema;

public class Main {
    public static void main(String[] args) {

        Cliente cl = new Cliente();
        CajaAhorro ca = new CajaAhorro(cl, 1000, 0.05);

        ca.extraerEfectivo(500);
        System.out.println(ca.getSaldo());

        ca.extraerEfectivo(1000);

        ca.depositar(5000);
        System.out.println(ca.getSaldo());

        ca.cobrarInteres();
        System.out.println(ca.getSaldo());

        System.out.println("/****** PRUEBAS CUENTA CORRIENTE ****/");

        CuentaCorriente cc = new CuentaCorriente(cl, 500, 100);

        cc.depositarCheques(new Cheque(200, "Santander"));
        System.out.println(cc.getSaldo());

        cc.extraerEfectivo(900);

        cc.extraerEfectivo(800);
        System.out.println(cc.getSaldo());
    }
}
