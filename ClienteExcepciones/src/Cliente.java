public class Cliente {

    private String nombre, apellido;
    private String dni;

    private double deuda,limite;

    public Cliente(String nombre, String apellido, String dni, double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.deuda = 0.0;
        this.limite = limite;

    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    //Cuando el cliente intenta comprar y el saldo supera su limite establecido no lo tengo que dejar
    public void comprar(double importe) throws  ClienteException{
        double gastoTotal = this.deuda + importe;
        if (gastoTotal > this.limite){
            throw new ClienteException("El gasto supera el limite establecido");
        }
        this.deuda = gastoTotal;
    }

    public void pagarTotalDeuda(double importe) throws ClienteException{
        double saldoDeuda = this.deuda - importe;
        if (saldoDeuda < 0){
            throw new ClienteException("Estas pagando de más");
        }
        this.deuda = saldoDeuda;
    }

}
