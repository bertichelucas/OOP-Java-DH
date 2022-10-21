public class AstraZeneca implements StrategyVacuna{

    public AstraZeneca() {
    }

    private String efectosSecundarios(){
        return "Aumento de temperatura";
    }

    @Override
    public void vacunar(Persona persona) {
        if (persona == null){
            return;
        }
        if(persona.getCantidadVacunas() < 1){
            persona.agregarDosis();
            System.out.println(persona.getNombre() + ": Has sido vacunado con Astra Zeneca, podes tener los siguentes síntomas: " + this.efectosSecundarios());
        } else{
            System.out.println("No es posible vacunarte");
        }
    }
}
