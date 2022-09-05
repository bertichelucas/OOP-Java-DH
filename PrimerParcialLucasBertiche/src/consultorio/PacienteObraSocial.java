package consultorio;

import java.util.Date;

public class PacienteObraSocial extends Paciente implements Comparable{

    private String nombreObraSocial;
    private int nroAsociado;

    public PacienteObraSocial(Consulta consulta, Date fechaNacimiento, String nombre, String apellido, String nombreObraSocial, int nroAsociado) {
        super(consulta, fechaNacimiento, nombre, apellido);
        this.nombreObraSocial = nombreObraSocial;
        this.nroAsociado = nroAsociado;
    }

    public int getNroAsociado() {
        return nroAsociado;
    }

    @Override
    public int compareTo(Object o) {

        //Devuelve 0 si son iguales
        //Numero < 0 si el actual es menor al pasado por parámetro
        //Numero > 0 si el actual es mayor al pasado por parámetro

        PacienteObraSocial pos = (PacienteObraSocial) o;
        return this.nroAsociado - pos.getNroAsociado();
    }
}
