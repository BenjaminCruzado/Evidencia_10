package Caso2;
import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Departamentos> departamentos = new ArrayList<Departamentos>();
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.departamentos = new ArrayList<Departamentos>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}