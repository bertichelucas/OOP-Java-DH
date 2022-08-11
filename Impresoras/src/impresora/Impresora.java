package impresora;

import java.util.Date;

public class Impresora {

    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int cantidadHojas;

    public Impresora(String modelo, String tipoConexion, Date fechaFabricacion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
    }

    public String imprimir(String texto, boolean tipoImpresion){
        if (texto == "") return "No hay nada para imprimir";
        if (tipoImpresion){
            return texto + " Este texto es en blanco y negro";
        }
        return texto + " Este texto es a color";
    }

    public Date getFechaFabricacion(){
        return this.fechaFabricacion;
    }

    public boolean tieneHojas(){
        return this.cantidadHojas > 0;
    }

    public void agregarHojas(int cantHojas){
        this.cantidadHojas += cantHojas;
    }

    @Override
    public String toString() {
        return "Impresora: " + this.modelo + " de conexion: " + this.tipoConexion;
    }
}
