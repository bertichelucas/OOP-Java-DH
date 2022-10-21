import java.util.ArrayList;

public class Idol implements Observable{

    private boolean enVlive;

    private ArrayList<Observador> observadores;

    public Idol() {
        this.enVlive = false;
        this.observadores = new ArrayList<>();
    }

    @Override
    public void agregar(Observador o) {
        observadores.add(o);
    }

    @Override
    public void quitar(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificar(String msg) {
        for (Observador o: this.observadores) {
            o.actualizar(msg);
        }
    }

    public void transmitir(){
        this.enVlive = true;
        this.notificar("Transmitiendo en vivo");
    }

    public void finalizarTransmision(){
        if(this.enVlive) {
            this.enVlive = false;
            this.notificar("Transmision finalizada");
        }
    }
}
