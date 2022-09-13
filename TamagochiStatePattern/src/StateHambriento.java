public class StateHambriento implements StateTamagochi{

    private Tamagochi tamagochi;

    public StateHambriento(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    @Override
    public void beber() {
        this.tamagochi.setEstado(new StateTriste(this.tamagochi));
    }

    @Override
    public void comer() {
        this.tamagochi.setEstado(new StateFeliz(this.tamagochi));
    }

    @Override
    public void mimar() {

    }
}
