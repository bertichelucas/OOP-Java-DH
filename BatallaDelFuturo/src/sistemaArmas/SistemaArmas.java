package sistemaArmas;

public abstract class SistemaArmas {

    private int energia;


    public SistemaArmas(int energia) {
        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public abstract void mostrar();


}
