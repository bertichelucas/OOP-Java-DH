package sistemaBanco;

public class CuentaCorriente extends Cuenta{

    private double sobregiro;

    public CuentaCorriente(double saldo, Cliente cliente, double sobregiro) {
        super(saldo, cliente);
        this.sobregiro = sobregiro;
    }

    public void depositar(Cheque cheque){
        super.setSaldo(cheque.getMonto());
    }

    public void extraerEfectivo(double monto){
        if(monto <= sobregiro + super.getSaldo()) super.setSaldo(super.getSaldo() - monto);
    }


}
