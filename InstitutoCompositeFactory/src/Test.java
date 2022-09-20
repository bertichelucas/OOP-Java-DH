import classes.Instituto;
import factories.CursoFactory;

public class Test {

    public static void main(String[] args) {

        Instituto instituto = new Instituto("Lacade");

        CursoFactory instance = CursoFactory.getInstance();

        instituto.agregarCurso(instance.crearCurso(CursoFactory.FRONT));
        instituto.agregarCurso(instance.crearCurso(CursoFactory.BACK));

        System.out.println(instituto.generarInforme());

        instituto.agregarCurso(instance.crearCurso(CursoFactory.FULLTIME));

        System.out.println(instituto.generarInforme());

    }
}
