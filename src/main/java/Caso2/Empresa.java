import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Departamentos> departamentos = new ArrayList<Departamentos>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}