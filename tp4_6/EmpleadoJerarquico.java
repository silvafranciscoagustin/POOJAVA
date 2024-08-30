package tp4_6;

import java.util.ArrayList;

public class EmpleadoJerarquico extends Empleado {
    ArrayList<Empleado> empleadosACargo = new ArrayList<>();

    public EmpleadoJerarquico(String nombre, String apellido, int edad,String cargo, int nroLegajo, double sueldo) {
        super(nombre,apellido,edad,cargo,nroLegajo,sueldo);
        this.empleadosACargo = new ArrayList<>();
    }

    public void addEmpleadoACargo(Empleado empleado) {
        this.empleadosACargo.add(empleado);
    }

}
