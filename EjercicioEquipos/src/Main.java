public class Main {

    public static void main(String[] args) {
        Equipo equipo = new Equipo("Camada 1");

        equipo.agregarJugador(new Jugador(1, "Pepe",false, true));
        equipo.agregarJugador(new Jugador(10, "Pablo",true, false));
        equipo.agregarJugador(new Jugador(3, "Nahuel",false, true));
        equipo.agregarJugador(new Jugador(11, "Carlitos",false, true));
        equipo.agregarJugador(new Jugador(2, "fernando",false, true));

        equipo.mostrarJugadoresTitulares();
        equipo.mostrarJugadores();
    }
}
