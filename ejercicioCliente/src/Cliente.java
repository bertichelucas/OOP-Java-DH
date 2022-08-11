public class Cliente {

    private int numeroCliente;
    private String nombre;
    private double deuda;

    public Cliente(int numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public void incrementarDeuda(double monto){
        this.deuda += monto;
    }

    public void pagarDeuda(){
        this.deuda = 0;
    }

    public String toString(){
        return  "nombre: "  + this.nombre +
                "\nnumero de cliente: "  + this.numeroCliente +
                "\ndeuda: " + this.deuda;
    }
}
