public class Main {

    public static void main(String[] args) {

        System.out.println("--------------CREACION CLIENTE--------------");
        Cliente cl = new Cliente(1231, "Carlos");
        System.out.println(cl);

        System.out.println("--------------INCREMENTO DEUDA--------------");
        cl.incrementarDeuda(35.0);
        System.out.println(cl);

        System.out.println("--------------PAGO DE DEUDA A 0--------------");
        cl.pagarDeuda();
        System.out.println(cl);
    }
}
