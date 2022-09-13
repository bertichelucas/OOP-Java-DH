public class Tamagochi {

    private String nombre;

    private StateTamagochi estado;

    public Tamagochi(String nombre){
        this.nombre = nombre;
        this.estado = new StateFeliz(this);
    }

    public void setEstado(StateTamagochi estado) {
        this.estado = estado;
    }

    public StateTamagochi getEstado() {
        return estado;
    }

    public void comer(){
        this.estado.comer();
    }

    public void beber(){
        this.estado.beber();
    }

    public void mimar(){
        this.estado.mimar();
    }
}
