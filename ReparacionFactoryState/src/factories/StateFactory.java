package factories;

import classes.Reparacion;
import states.*;

public class StateFactory {

    private static StateFactory instance;
    public static final String ENPRESUPUESTO = "EnPresupuesto";
    public static final String ENREPARACION = "EnReparacion";
    public static final String PARAENVIO = "ParaEnvio";
    public static final String FINALIZADO = "Finalizado";

    private StateFactory(){};

    public static StateFactory getInstance(){
        if (instance == null){
            instance = new StateFactory();
        }
        return instance;
    }

    public ReparacionState changeState(String codigo, Reparacion reparacion){
        switch (codigo){
            case ENPRESUPUESTO:
                return new EnPresupuesto(reparacion);
            case ENREPARACION:
                return new EnReparacion(reparacion);
            case PARAENVIO:
                return new ParaEnvio(reparacion);
            case FINALIZADO:
                return new Finalizado(reparacion);
            default:
                return null;
        }


    }
}
