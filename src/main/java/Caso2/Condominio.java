import java.util.ArrayList;

public class Condominio {
	private String nombre;
	private ArrayList<Casa> casas = new ArrayList<Casa>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}