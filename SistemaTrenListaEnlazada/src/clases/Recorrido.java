package clases;

import excepciones.RecorridoException;

import java.util.List;

public class Recorrido {

    private String estacionOrigen;
    private String estacionDestino;

    private int indexOrigen;
    private int indexDestino;

    private List<String> estaciones;

    public Recorrido(String origen, String destino, List<String> listaEstaciones) throws RecorridoException {
        if (!listaEstaciones.contains(origen)){
            throw new RecorridoException("El origen es invalido");
        }
        if (!listaEstaciones.contains(destino)){
            throw new RecorridoException("El destino es invalido");
        }
        this.estacionOrigen = origen;
        this.estacionDestino =destino;
        this.estaciones = listaEstaciones;

        this.indexOrigen = this.estaciones.indexOf(origen);
        this.indexDestino = this.estaciones.indexOf(destino);

    }

    public boolean esCompleto(){
        //compruebo que el origen sea cabecera. Para ser cabecera debe ser el primero o ultimo elemento del array
        if(this.estaciones.indexOf(estacionOrigen) == 0 || this.estaciones.indexOf(estacionOrigen) == this.estaciones.size() - 1){
            return (this.estaciones.indexOf(estacionDestino) == 0 || this.estaciones.indexOf(estacionDestino) == this.estaciones.size() -1);
        }
        return false;
    }

    public boolean pasaPorEstacion(String estacion){
        if (this.indexOrigen < this.indexDestino){
            for (int i = this.indexOrigen; i < this.indexDestino; i++){
                if(estacion == this.estaciones.get(i)) return true;
            }
        }else{
            for (int i = this.indexOrigen; i < this.indexDestino; i--){
                if(estacion == this.estaciones.get(i)) return true;
            }
        }
        return false;
    }
}
