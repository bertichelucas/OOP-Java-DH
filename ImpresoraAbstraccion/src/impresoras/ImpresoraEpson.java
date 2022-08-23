package impresoras;

public class ImpresoraEpson extends Impresora{


    public ImpresoraEpson(String modelo, String tipoConexion, int hojasDisponibles, double porcentajeTinta) {
        super(modelo, tipoConexion, hojasDisponibles, porcentajeTinta);
    }

    @Override
    public String imprimir(String texto){
        if(!super.necesitaTinta() && super.tienePapel()) return texto;
        return "No puedo imprimir";
    }
}
