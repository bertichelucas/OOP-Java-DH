package clases;

import excepciones.RecorridoException;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTrenes {


    private String nombre;
    private List<Reserva> listaReservas;
    private List<String> estaciones;

    private List<String> generarEstaciones(String[] listaEstaciones){
        ArrayList<String> nuevaListaEstaciones = new ArrayList<>();
        for (int i = 0; i < listaEstaciones.length; i++){
            nuevaListaEstaciones.add(listaEstaciones[i]);
        }
        return nuevaListaEstaciones;
    }

    public EmpresaTrenes(String nombre, String[] listaEstaciones) {
        this.nombre = nombre;
        this.listaReservas = new ArrayList<>();
        this.estaciones = generarEstaciones(listaEstaciones);
    }

    public double recaudacionTotal(){
        double total = 0;
        for(int i = 0; i < this.listaReservas.size(); i++){
            total += this.listaReservas.get(i).calcularPrecioTotal();
        }
        return total;
    }

    public int cantVecesRecorrida(String estacion){
        int counter = 0;
        for(int i = 0; i < this.listaReservas.size();i++){
            if(this.listaReservas.get(i).pasaPorEstacion(estacion)) counter++;
        }
        return counter;
    }

    public void agregarEstacion(String estacion, int posicion){
        if(posicion <= this.estaciones.size()){
            this.estaciones.add(posicion, estacion);
        }

    }

    public void mostrarEstaciones(){
        System.out.println(this.estaciones);
    }

    public void generarReserva(String origen, String destino, int cantidadPersonas){
        try {
            listaReservas.add(new Reserva(this.listaReservas.size() + 1, origen, destino, estaciones, cantidadPersonas));
        }catch(RecorridoException e){
            System.out.println(e);
        }
    }
}
