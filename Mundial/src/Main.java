import clases.Equipo;
import clases.Jugador;
import excepciones.EquipoException;

public class Main {

    public static void main(String[] args) {

        Equipo equipo = new Equipo("Argentina");
        String[] posiciones = {"Arquero", "Defensor", "Mediocampista", "Delantero"};
        String[] tipos = {"Titular", "Suplente", "Reserva"};

        try {
            for (int i = 0; i < 23; i++) {
                equipo.agregarJugador(new Jugador(posiciones[i % (posiciones.length)], "Pepito" + i + 1, tipos[i % (tipos.length)], i + 1));
            }
        } catch (EquipoException e) {
            System.out.println(e);
        }

        System.out.println("Jugadores de la reserva");
        for (Jugador jugador : equipo.obtenerReservas()) {
            System.out.println(jugador);
        }


        try {
            String posicion = "Defensor";
            System.out.print("Jugadores en la posicion de " + posicion + ": " );
            System.out.println(equipo.cantidadJugadores(posicion));
        }catch (EquipoException e){
            System.out.println(e);
        }
    }
}
