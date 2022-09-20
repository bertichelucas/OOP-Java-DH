package classes;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo implements Curso{

    private String nombre, descripcion;
    private double bonificacion;
    private List<Curso> listaCursos;

    public ProgramaIntensivo(String nombre, String descripcion, double bonificacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.bonificacion = bonificacion;
        this.listaCursos = new ArrayList<>();
    }

    @Override
    public double calcularPrecio() {
        double precioTotal = 0;
        for (Curso curso: this.listaCursos) {
            precioTotal += curso.calcularPrecio();
        }
        return precioTotal - precioTotal * this.bonificacion;
    }

    public void agregarCurso(Curso curso){
        this.listaCursos.add(curso);
    }

    @Override
    public String toString() {
        return "ProgramaIntensivo{" +
                "nombre='" + nombre + '\'' +
                ", precioTotal= " + this.calcularPrecio() + "}";
    }
}
