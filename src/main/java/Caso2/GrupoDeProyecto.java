package Caso2;
import java.util.ArrayList;

public class GrupoDeProyecto {
	private String nombre;
	private Departamentos departamento;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}