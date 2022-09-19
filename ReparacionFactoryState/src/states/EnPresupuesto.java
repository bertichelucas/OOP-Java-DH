package states;

import classes.Reparacion;
import factories.StateFactory;

public class EnPresupuesto implements ReparacionState{

    private Reparacion reparacion;

    public EnPresupuesto(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    @Override
    public void cambiarDireccion(String direccion) throws Exception {
        throw new Exception("No se puede cambiar la direccion");
    }

    @Override
    public void valorPresupuesto(double valor) throws Exception {
        reparacion.setPresupuesto(valor);
    }

    @Override
    public void agregarRepuesto(double valorRepuesto) throws Exception {
        throw  new Exception("No puedo agregar un repuesto en este estado");
    }

    @Override
    public void siguienteEstado() throws Exception {
        ReparacionState nuevoEstado = StateFactory.getInstance().changeState(StateFactory.ENREPARACION, this.reparacion);
        if (nuevoEstado != null){
            this.reparacion.setState(nuevoEstado);
            System.out.println(this.reparacion);
        }

    }
}
