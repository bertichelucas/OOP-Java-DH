package sistemaBanco;

import java.util.Date;

public class Cheque {

    private double monto;
    private String nombreBanco;
    private Date fechaDePago;

    public Cheque(double monto, String nombreBanco, Date fechaDePago) {
        this.monto = monto;
        this.nombreBanco = nombreBanco;
        this.fechaDePago = fechaDePago;
    }

    public double getMonto() {
        return monto;
    }
}
