package sistemaBanco;

public class CajaAhorro extends Cuenta{

    private double tasaInteres;

    public CajaAhorro(double saldo, Cliente cliente, double tasaInteres) {
        super(saldo, cliente);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void extraerEfectivo(double monto){
        if (super.getSaldo() - monto >= 0) super.setSaldo(super.getSaldo() -monto);
    }

    public double cobrarInteres(){
        return super.getSaldo() * tasaInteres;
    }


}
