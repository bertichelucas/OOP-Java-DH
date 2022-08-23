package impresoras;

public class ImpresoraCannon extends  Impresora{

    public ImpresoraCannon(String modelo, String tipoConexion, int hojasDisponibles, double porcentajeTinta) {
        super(modelo, tipoConexion, hojasDisponibles, porcentajeTinta);
    }

    @Override
    public String imprimir(String texto) {
        return texto;
    }
}
