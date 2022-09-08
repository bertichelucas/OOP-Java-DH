public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pablo", "Palacios", "42221241", 1500);

        cliente.setDeuda(700);

        try{
            cliente.comprar(1000);
        }
        catch(ClienteException e){
            System.out.println(e);
        }
    }
}
