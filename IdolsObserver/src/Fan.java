public class Fan implements Observador {

    private String nombre, apellido;

    private int nivelFan;

    public Fan(String nombre, String apellido, int nivelFan) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivelFan = nivelFan;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nivelFan=" + nivelFan +
                '}';
    }

    @Override
    public void actualizar(String notificacion) {
        System.out.println(this);
        System.out.println("Mensaje de tu idol:" + notificacion);
    }
}
