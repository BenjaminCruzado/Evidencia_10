import java.util.ArrayList;

public class Departamentos {
	private String nombre;
	private Empresa empresa;
	private ArrayList<GrupoDeProyecto> grupos_de_proyecto = new ArrayList<GrupoDeProyecto>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}