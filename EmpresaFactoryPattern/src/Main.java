public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa("Camada1");

        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();

        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-RD"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-RD"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-C"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-RD"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-C"));
        empresa.agregarEmpleado(empleadoFactory.generarEmpleado("EMP-C"));

        for (Empleado empleado: empresa.getListaEmpleados()) {
            System.out.println(empleado.calcularSueldo(25));
        }

        System.out.println("Sueldo total: " + empresa.calcularTotalDeSueldos(25));
    }
}
