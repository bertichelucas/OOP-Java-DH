package states;

import classes.Reparacion;
import factories.StateFactory;

public class ParaEnvio implements  ReparacionState{

    private Reparacion reparacion;

    public ParaEnvio(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    @Override
    public void cambiarDireccion(String direccion) throws Exception {
        this.reparacion.setDireccion(direccion);
    }

    @Override
    public void valorPresupuesto(double valor) throws Exception {
        throw new Exception("No se puede cambiar el presupuesto");
    }

    @Override
    public void agregarRepuesto(double valorRepuesto) throws Exception {
        throw  new Exception("No puedo agregar un repuesto en este estado");
    }

    @Override
    public void siguienteEstado() throws Exception {
        ReparacionState nuevoEstado = StateFactory.getInstance().changeState(StateFactory.FINALIZADO, this.reparacion);
        if (nuevoEstado != null){
            this.reparacion.setState(nuevoEstado);
            System.out.println(this.reparacion);
        }
    }


}
