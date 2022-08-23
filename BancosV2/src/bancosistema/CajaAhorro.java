package bancosistema;

public class CajaAhorro extends Cuenta {

    private double tasaInteres;

    public CajaAhorro(Cliente cliente,double saldo, double tasaInteres) {
        super(cliente, saldo);
        this.tasaInteres = tasaInteres;

    }

    @Override
    public void extraerEfectivo(double monto){
        if (this.getSaldo() >= monto) {
            this.setSaldo(this.getSaldo() - monto);
        }else{
            System.out.println("No es posible extraer esa cantidad");
        }
    }

    public void cobrarInteres(){
        this.setSaldo(this.getSaldo() + this.getSaldo() * tasaInteres);
    }


}
