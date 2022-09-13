public class StateFeliz implements StateTamagochi{

    private Tamagochi tamagochi;

    public StateFeliz(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    @Override
    public void beber() {
    this.tamagochi.setEstado(new StateHambriento(this.tamagochi));
    }

    @Override
    public void comer() {
        this.tamagochi.setEstado(new StateSediento(this.tamagochi));
    }

    @Override
    public void mimar() {
    }
}
