package consultorio;


import java.util.Calendar;
import java.util.Date;


public class Consulta {

    private Date fechaConsulta;
    private String especialidad;
    private int hora;
    private int minutos;

    public Consulta(Date fechaConsulta, String especialidad, int hora, int minutos) {
        this.fechaConsulta = fechaConsulta;
        this.especialidad = especialidad;
        this.hora = hora;
        this.minutos = minutos;
    }

}
