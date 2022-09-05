import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Jugador> listaJugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.listaJugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        this.listaJugadores.add(jugador);
    }

    public void mostrarJugadoresTitulares(){
        this.listaJugadores.sort(null);
        for (Jugador jugador: this.listaJugadores) {
            if (jugador.isTitular()){
                System.out.println(jugador);
            }
        }
    }

    public void mostrarJugadores(){
        for (Jugador jugador: this.listaJugadores) {
                System.out.println(jugador);
        }
    }
}
