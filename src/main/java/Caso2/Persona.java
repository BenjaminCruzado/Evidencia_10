package Caso2;
import java.util.ArrayList;

public class Persona {
	private String nombre;
	private ArrayList<Moto> moto = new ArrayList<Moto>();
	private Casa casa;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}