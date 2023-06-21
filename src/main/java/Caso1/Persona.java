package Caso1;
import java.util.ArrayList;

public class Persona {
	private int edad;
	private String nombre;
	private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
		this.mascotas = new ArrayList<Mascota>();
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}