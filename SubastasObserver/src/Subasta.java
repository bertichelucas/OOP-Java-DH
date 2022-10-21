import java.util.ArrayList;

public class Subasta implements Observable{

    private Oferente ultimoOferente;
    private double ultimoMontoOfertado;
    private ArrayList<Observador> listaObservadores;

    public Oferente getUltimoOferente() {
        return ultimoOferente;
    }

    public double getUltimoMontoOfertado() {
        return ultimoMontoOfertado;
    }

    public Subasta(double montoInicio) {
        this.ultimoMontoOfertado = montoInicio;
        this.listaObservadores = new ArrayList<>();
    }

    @Override
    public void agregarObservador(Observador o) {
        this.listaObservadores.add(o);
    }

    @Override
    public void removerObservador(Observador o) {
        this.listaObservadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observador o: this.listaObservadores) {
            o.actualizar(this);
        }
    }

    public void ofertar(double montoOferta, Oferente oferente){
        this.ultimoMontoOfertado = montoOferta;
        this.ultimoOferente = oferente;
        this.notificarObservadores();
    }



}
