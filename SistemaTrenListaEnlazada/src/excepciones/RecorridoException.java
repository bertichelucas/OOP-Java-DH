package excepciones;

public class RecorridoException extends Exception{

    public RecorridoException(){
        super();
    }

    public RecorridoException(String msg){
        super(msg);
    }

    @Override
    public String toString() {
        return "Error: " + this.getClass().getName()  + " Mensaje: " + this.getMessage();
    }
}
