import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombreEmpresa;
    private List<Empleado> listaEmpleados;

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.listaEmpleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        this.listaEmpleados.add(empleado);
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public double calcularTotalDeSueldos(int dias){
        double sueldoTotal = 0;
        for (Empleado empleado: this.listaEmpleados) {
            sueldoTotal += empleado.calcularSueldo(dias);
        }
        return sueldoTotal;
    }
}
