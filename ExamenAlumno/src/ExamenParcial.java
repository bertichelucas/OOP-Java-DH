public class ExamenParcial extends Examen {

    private int nroUnidad;
    private int nroIntentos;

    public ExamenParcial(String titulo, String enunciado, int nota, Alumno alumno, int nroUnidad) {
        super(titulo, enunciado, nota, alumno);
        this.nroUnidad = nroUnidad;
        this.nroIntentos = 0;
    }

    @Override
    public boolean aprobado() {
        return (this.getNota() >= 4);
    }

    public boolean esRecuperable(){
        if ((this.nroUnidad <= 3 && this.nroIntentos < 3)||(this.nroUnidad > 3 && this.nroIntentos < 2)) {
            this.nroIntentos++;
            return true;
        }
        return false;
    }
}
