package consultorio;

import java.util.Date;

public abstract class Paciente {

    private Consulta consulta;
    private Date fechaNacimiento;
    private String nombre;
    private String apellido;
    private boolean primeraConsulta;

    public Paciente(Consulta consulta, Date fechaNacimiento, String nombre, String apellido) {
        //Cuando se crea el paciente, la consulta pasada es la primera. En caso de asignar
        //una consulta extra, el paciente ya habra sido creado previamente.
        this.consulta = consulta;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.primeraConsulta = true;
    }

    public  boolean debeHacerEvaluacionInicial(){
        return this.primeraConsulta;
    }

    /*

    Ejemplo de asignacion de nueva consulta al paciente

    public void asignarNuevaConsulta(Consulta consulta){
        this.primeraConsulta = false;
        this.consulta = consulta;

    }
     */
}
