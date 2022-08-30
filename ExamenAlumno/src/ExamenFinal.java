public class ExamenFinal extends  Examen implements Comparable{

    private int notaOral;
    private String descripcionTema;


    public ExamenFinal(String titulo, String enunciado, int nota, Alumno alumno, int notaOral, String descripcionTema) {
        super(titulo, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.descripcionTema = descripcionTema;
    }

    @Override
    public boolean aprobado() {
        return (this.notaOral >=  4 && this.getNota() >= 4);
    }

    public int calcularPromedio(){
        return ((this.getNota() + this.notaOral) / 2);
    }

    @Override
    public int compareTo(Object o) {
        ExamenFinal ef = (ExamenFinal) o;

        return calcularPromedio() - ef.calcularPromedio();
        //Devuelve un nro > 0 si el actual es mayor al pasado por parámetro
        //Devuelve 0 si los promedios son iguales
        //Devuelve un nro < 0 si el actual es menor al pasado por parámetro
    }
}
