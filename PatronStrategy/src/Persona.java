public class Persona {

    private String nombre;
    private int cantidadVacunas;

    public Persona(String nombre){
        this.nombre = nombre;
        this.cantidadVacunas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadVacunas() {
        return cantidadVacunas;
    }

    public void agregarDosis(){
        this.cantidadVacunas++;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", cantidadVacunas=" + cantidadVacunas +
                '}';
    }
}
