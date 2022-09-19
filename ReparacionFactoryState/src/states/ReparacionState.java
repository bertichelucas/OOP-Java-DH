package states;

public interface ReparacionState {

    void cambiarDireccion(String direccion) throws Exception;

    void valorPresupuesto(double valor) throws Exception;

    void agregarRepuesto(double valorRepuesto) throws Exception;

    void siguienteEstado() throws Exception;
}
