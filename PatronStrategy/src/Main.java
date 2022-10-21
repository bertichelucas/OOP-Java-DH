public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Carlos");
        Vacuna vacuna = new Vacuna(new AstraZeneca());
        vacuna.vacunar(persona);
    }
}
