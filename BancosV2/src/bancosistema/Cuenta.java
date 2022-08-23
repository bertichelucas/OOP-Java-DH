package bancosistema;

public abstract class Cuenta {

    private Cliente cliente;
    private double saldo;

    public Cuenta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto){
        this.saldo += monto;
    }

    public abstract void extraerEfectivo(double monto);


}
