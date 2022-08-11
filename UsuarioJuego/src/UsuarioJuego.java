public class UsuarioJuego {

    //atributos

    private String nombre;
    private String clave;
    private double puntaje = 0;
    private int nivel = 0;

    //constructor

    public UsuarioJuego(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
    }

    //getters

    public String getNombre(){
        return this.nombre;
    }

    public String getClave(){
        return this.clave;
    }

    public Double getPuntaje(){
        return this.puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    //metodos

    public void aumentarPuntaje(){
        this.puntaje += 1;
    }

    public void subirNivel(){
        this.nivel += 1;
    }

    public void bonus(int valor){
        this.puntaje += valor;
    }


}