public class EmpleadoDependencia extends Empleado {

    private double sueldoMensual;

    public EmpleadoDependencia(String nombre, String apellido, int legajo, double sueldoMensual) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo(int dias) {
        return this.sueldoMensual * dias / 30;
    }
}
