public class Jugador implements Comparable<Jugador> {

    private int nroCamiseta;
    private String nombre;
    private boolean lesionado, titular;

    public Jugador(int nroCamiseta, String nombre, boolean lesionado, boolean titular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public boolean isTitular() {
        return titular;
    }

    @Override
    public int compareTo(Jugador jugador) {
        return this.nroCamiseta - jugador.nroCamiseta;
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "nroCamiseta=" + nroCamiseta +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
