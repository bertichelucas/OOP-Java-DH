public class Vacuna {

    private StrategyVacuna estrategiaVacuna;

    public Vacuna(StrategyVacuna estrat){
        this.estrategiaVacuna = estrat;
    }

    public void vacunar(Persona persona){
        estrategiaVacuna.vacunar(persona);
    }
}
