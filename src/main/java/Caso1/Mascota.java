package Caso1;
public class Mascota {
	private String nombre;
	private String color;
	private Persona persona;
	public Mascota(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
		this.persona = null;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}