public class Main {

    public static void main(String[] args) {

        Idol idol = new Idol();
        Fan fan1 = new Fan("Carlitos", "Tevez", 1);
        Fan fan2 = new Fan("Diego", "Milito", 2);

        idol.agregar(fan1);
        idol.agregar(fan2);

        idol.transmitir();
        idol.finalizarTransmision();

    }
}
