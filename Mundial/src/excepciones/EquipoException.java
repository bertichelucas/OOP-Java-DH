package excepciones;

public class EquipoException extends Exception{

    public EquipoException(){
        super();
    }

    public EquipoException(String msg){
        super(msg);
    }

    @Override
    public String toString() {
        return "Error: " + this.getClass().getName() + " Mensaje: " + this.getMessage();
    }
}
