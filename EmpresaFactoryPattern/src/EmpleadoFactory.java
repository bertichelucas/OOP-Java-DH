public class EmpleadoFactory {

    private static EmpleadoFactory instance;

    private EmpleadoFactory() {
    }

    public static EmpleadoFactory getInstance() {
        if (instance == null){
            instance = new EmpleadoFactory();
        }

        return instance;
    }

    public Empleado generarEmpleado(String codigo){
        switch (codigo){
            case "EMP-RD":
                return new EmpleadoDependencia("nombre rd", "apellido rd", 0000, 1000);
            case "EMP-C":
                return new EmpleadoContratado("nombre c", "apellido c", 0000, 7.0, 0.14);
            default:
                return null;
        }

    }
}
