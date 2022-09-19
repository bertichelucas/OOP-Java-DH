package classes;

import factories.StateFactory;
import states.ReparacionState;

public class Reparacion {

    private String articulo;
    private double presupuesto;
    private String direccion;
    private ReparacionState state;

    public Reparacion(String articulo) {
        this.articulo = articulo;
        this.state = StateFactory.getInstance().changeState(StateFactory.ENPRESUPUESTO, this);
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public ReparacionState getState() {
        return state;
    }

    public void setState(ReparacionState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Reparacion{" +
                "articulo='" + articulo + '\'' +
                ", presupuesto=" + presupuesto +
                ", direccion='" + direccion + '\'' +
                ", state=" + state +
                '}';
    }

    //Responsabilidades propias de la clase:

    public void cambiarDireccion(String direccion) throws Exception{
        this.state.cambiarDireccion(direccion);
    }

    public void valorPresupuesto(double valor) throws Exception{
        this.state.valorPresupuesto(valor);
    }

    public void agregarRepuesto(double valorRepuesto) throws Exception{
        this.state.agregarRepuesto(valorRepuesto);
    }

    public void siguienteEstado() throws Exception{
        this.state.siguienteEstado();
    }
}
