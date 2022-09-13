public class Main {

    public static void main(String[] args) {


        Tamagochi tamagochi = new Tamagochi("Carlitos");

        tamagochi.beber();
        System.out.println(tamagochi.getEstado().getClass());
        tamagochi.comer();
        System.out.println(tamagochi.getEstado().getClass());


    }
}
