public class Oferente implements Observador{

    private String nombre;
    private double montoDispuestoAOfertar;

    @Override
    public void actualizar(Observable o) {
        Subasta sub = (Subasta) o;
        if (this != sub.getUltimoOferente() && sub.getUltimoMontoOfertado() < this.montoDispuestoAOfertar){
            sub.ofertar(this.montoDispuestoAOfertar, this);
        }
    }
}
