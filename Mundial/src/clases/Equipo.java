package clases;

import excepciones.EquipoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Equipo {

    private String nombre;
    private List<Jugador> listaJugadores;


    public Equipo(String nombre) {
        this.nombre = nombre;
        this.listaJugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) throws EquipoException{
        if(listaJugadores.size() >= 23){
            throw new EquipoException("El equipo está completo, no se puede agregar más jugadores");
        }
        listaJugadores.add(jugador);
    }

    public void printJugadores(){
        for (Jugador jugador: this.listaJugadores) {
            System.out.println(jugador);
        }
    }

    public List<Jugador> obtenerReservas(){
        List<Jugador> jugadoresReserva = new ArrayList<>();
        for(int i = 0; i < this.listaJugadores.size(); i++){
            if(listaJugadores.get(i).getTipo() == "Reserva"){
                jugadoresReserva.add(listaJugadores.get(i));
            }
        }
        return jugadoresReserva;
    }

    public int cantidadJugadores(String posicion) throws EquipoException{

        List<String> posiciones = new Vector<>();
        posiciones.add("Arquero");
        posiciones.add("Mediocampista");
        posiciones.add("Defensor");
        posiciones.add("Delantero");

        if(!posiciones.contains(posicion)){
            throw new EquipoException("Esta posicion no existe");
        }

        int count = 0;
        for(int i = 0; i < listaJugadores.size(); i++){
            if (listaJugadores.get(i).getPosicion() == posicion) count++;
        }

        return count;
    }
}
