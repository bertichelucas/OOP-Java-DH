package clases;

public class Jugador {

    private String posicion, apellido, tipo;
    private int nroCamiseta;

    public Jugador(String posicion, String apellido, String tipo, int nroCamiseta) {
        this.posicion = posicion;
        this.apellido = apellido;
        this.tipo = tipo;
        this.nroCamiseta = nroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "posicion='" + posicion + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nroCamiseta=" + nroCamiseta +
                '}';
    }
}
