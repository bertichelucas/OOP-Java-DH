package clases;

import excepciones.RecorridoException;

import java.util.List;

public class Reserva {

    private final double COSTO_BOLETO = 50;

    private int codigo;
    private Recorrido recorrido;
    private int cantidadPersonas;

    public Reserva(int codigo, String origen, String destino, List<String> estaciones, int cantidadPersonas) throws RecorridoException {
        this.codigo = codigo;
        try {
            this.recorrido = new Recorrido(origen, destino, estaciones);
        } catch(RecorridoException e){
            throw e;
        }
        this.cantidadPersonas = cantidadPersonas;
    }

    public double calcularPrecioTotal(){
        double precio = this.cantidadPersonas * COSTO_BOLETO;
        if (this.recorrido.esCompleto()){
            precio = precio * 0.8;
        }
        return precio;
    }

    public boolean pasaPorEstacion(String estacion){
        return this.recorrido.pasaPorEstacion(estacion);
    }
}
