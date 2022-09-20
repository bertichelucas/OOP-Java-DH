package classes;

public class CursoIndividual implements  Curso{


    private String nombre, descripcion;
    private double precioPorHora, cargaHoraria, cantidadMeses;

    public CursoIndividual(String nombre, String descripcion, double precioPorHora, double cargaHoraria, double cantidadMeses) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioPorHora = precioPorHora;
        this.cargaHoraria = cargaHoraria;
        this.cantidadMeses = cantidadMeses;
    }

    @Override
    public double calcularPrecio() {
        return this.precioPorHora * this.cargaHoraria * this.cantidadMeses;
    }

    @Override
    public String toString() {
        return "CursoIndividual{" +
                "nombre='" + nombre + '\'' +
                ", precioTotal= " + this.calcularPrecio() + "}";
    }
}
