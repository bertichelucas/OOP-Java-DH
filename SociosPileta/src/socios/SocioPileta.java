package socios;

public class SocioPileta extends Socio{

    private double costoPileta;
    private boolean habilitado;

    public SocioPileta(String numeroSocio, String nombre, double costoMensual, String actividad, double costoPileta, boolean habilitado) {
        super(numeroSocio, nombre, costoMensual, actividad);
        this.costoPileta = costoPileta;
        this.habilitado = habilitado;
    }

    @Override
    public String toString() {
        return super.toString() +
                "costoPileta=" + costoPileta +
                ", habilitado=" + habilitado +
                '}';
    }

    @Override
    public double calcularCostoMensual(){
        if (this.habilitado){
            return this.costoPileta + super.calcularCostoMensual();
        }
        return super.calcularCostoMensual();
    }
}
