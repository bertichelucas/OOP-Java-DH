package impresoras;

import java.util.Date;

public abstract class Impresora {

    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int hojasDisponibles;
    private double porcentajeTinta;

    public Impresora(String modelo, String tipoConexion, int hojasDisponibles, double porcentajeTinta) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = new Date();
        this.hojasDisponibles = hojasDisponibles;
        this.porcentajeTinta = porcentajeTinta;
    }

    public boolean tienePapel(){
        return this.hojasDisponibles > 0;
    }

    public boolean necesitaTinta(){
        return this.porcentajeTinta < 5;
    }

    public abstract String imprimir(String texto);
}
