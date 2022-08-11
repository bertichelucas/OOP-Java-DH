public class Main {
    public static void main(String[] args) {
        UsuarioJuego usuario = new UsuarioJuego("juan",  "hola");
        System.out.println(usuario.getNombre());
        System.out.println(usuario.getClave());
        System.out.println(usuario.getPuntaje());
        usuario.bonus(10);
        System.out.println(usuario.getPuntaje());
        usuario.aumentarPuntaje();
        System.out.println(usuario.getPuntaje());
        usuario.subirNivel();
        System.out.println(usuario.getNivel());
    }
}