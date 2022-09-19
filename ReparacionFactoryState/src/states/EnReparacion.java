package states;

import classes.Reparacion;
import factories.StateFactory;

public class EnReparacion implements ReparacionState{

    private Reparacion reparacion;

    public EnReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    @Override
    public void cambiarDireccion(String direccion) throws Exception {
        throw new Exception("No se puede cambiar la direccion");
    }

    @Override
    public void valorPresupuesto(double valor) throws Exception {
        throw new Exception("No se puede cambiar el presupuesto");
    }

    @Override
    public void agregarRepuesto(double valorRepuesto) throws Exception {
        reparacion.setPresupuesto(reparacion.getPresupuesto() + valorRepuesto);
    }

    @Override
    public void siguienteEstado() throws Exception {
        ReparacionState nuevoEstado = StateFactory.getInstance().changeState(StateFactory.PARAENVIO, this.reparacion);
        if (nuevoEstado != null){
            this.reparacion.setState(nuevoEstado);
            System.out.println(this.reparacion);
        }
    }
}
