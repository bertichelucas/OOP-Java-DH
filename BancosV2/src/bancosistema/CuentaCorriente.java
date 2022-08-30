package bancosistema;

public class CuentaCorriente extends Cuenta implements  GravarImpuesto, Comparable {

    private double giroDescubierto;

    public void depositarCheques(Cheque cheque){
       this.setSaldo(this.getSaldo() + cheque.getMonto());
    }

    public CuentaCorriente(Cliente cliente, double saldo, double giroDescubierto) {
        super(cliente, saldo);
        this.giroDescubierto = giroDescubierto;
    }

    @Override
    public void extraerEfectivo(double monto){
        if(monto <= this.getSaldo() + this.giroDescubierto){
            this.setSaldo(this.getSaldo() -monto);
        } else{
            System.out.println("No es posible extraer esa cantidad");
        }
    }

    @Override
    public double gravar(double porcentaje){
        double montoADescontar = this.getSaldo() * porcentaje;
        this.setSaldo(this.getSaldo() - montoADescontar);

        return montoADescontar;
    }

    @Override
    public int compareTo(Object o) {
        CuentaCorriente cc = (CuentaCorriente) o;

        return (int)(this.getSaldo() - cc.getSaldo());
    }
}
