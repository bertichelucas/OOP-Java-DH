package consultorio;

import java.util.Date;

public class PacienteParticular extends Paciente {

    private String dni;
    private double costoConsulta;

    public PacienteParticular(Consulta consulta, Date fechaNacimiento, String nombre, String apellido, String dni, double costoConsulta) {
        super(consulta, fechaNacimiento, nombre, apellido);
        this.dni = dni;
        this.costoConsulta = costoConsulta;
    }


}
