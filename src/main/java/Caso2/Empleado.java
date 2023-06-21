package Caso2;
public class Empleado extends Persona {
	private String nombre;
	private GrupoDeProyecto grupo_de_proyecto;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}