package classes;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private String nombre;
    private List<Curso> listaCursos;

    public Instituto(String nombre) {
        this.nombre = nombre;
        this.listaCursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso){
        this.listaCursos.add(curso);
    }

    public String generarInforme(){

        List<String> informe = new ArrayList<>();

        for (Curso curso: this.listaCursos) {
            informe.add(curso.toString());
        }

        return informe.toString();
    }

}
