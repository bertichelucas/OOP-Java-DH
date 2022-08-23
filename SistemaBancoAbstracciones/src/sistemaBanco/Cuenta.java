package sistemaBanco;

public abstract class Cuenta {

    private double saldo;
    private Cliente cliente;

    public Cuenta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto){
        this.saldo += monto;
    };

    public abstract void extraerEfectivo(double monto);

    public  double informarSaldo(){
        return this.saldo;
    }


}
