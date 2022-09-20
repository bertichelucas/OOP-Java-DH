package factories;

import classes.Curso;
import classes.CursoIndividual;
import classes.ProgramaIntensivo;

public class CursoFactory {

    private static CursoFactory instance;

    public static final String FRONT = "Frontend";
    public static final String BACK = "Backend";
    public static final String FULLTIME = "Full Time";

    private CursoFactory() {
    }

    public static CursoFactory getInstance() {
        if (instance == null){
            instance = new CursoFactory();
        }

        return instance;
    }


    public Curso crearCurso(String codigo){
        switch (codigo){
            case FRONT:
                return new CursoIndividual(FRONT, "", 1000, 16, 2);
            case BACK:
                return new CursoIndividual(BACK, "", 900, 20, 2);
            case FULLTIME:
                ProgramaIntensivo pi = new ProgramaIntensivo(FULLTIME, "", 0.2);
                pi.agregarCurso(crearCurso(FRONT));
                pi.agregarCurso(crearCurso(BACK));
                return pi;
            default:
                return null;
        }
    }
}
