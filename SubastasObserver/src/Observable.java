public interface Observable {

    void agregarObservador(Observador o);

    void removerObservador(Observador o);

    void notificarObservadores();
}
