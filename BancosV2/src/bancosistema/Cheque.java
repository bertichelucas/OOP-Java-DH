package bancosistema;

import java.util.Date;

public class Cheque {

    private double monto;
    private String banco;
    private Date fechaPago;

    public Cheque(double monto, String banco) {
        this.monto = monto;
        this.banco = banco;
        this.fechaPago = new Date();
    }

    public double getMonto() {
        return monto;
    }

}
