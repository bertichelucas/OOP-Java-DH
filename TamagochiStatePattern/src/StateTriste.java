public class StateTriste implements StateTamagochi{

    private Tamagochi tamagochi;

    public StateTriste(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    @Override
    public void beber() {
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("no puedo tomar");
    }

    @Override
    public void comer() {
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Vomite");
    }

    @Override
    public void mimar() {
        this.tamagochi.setEstado(new StateFeliz(this.tamagochi));
    }
}
