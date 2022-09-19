package states;

import classes.Reparacion;

public class Finalizado implements ReparacionState{

    private Reparacion reparacion;

    public Finalizado(Reparacion reparacion) {
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
        throw  new Exception("No puedo agregar un repuesto en este estado");
    }

    @Override
    public void siguienteEstado() throws Exception {
        throw new Exception("No hay siguiente paso, reparacion finalizada.");
    }
}
