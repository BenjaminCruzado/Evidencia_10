package Caso1;
public class Gato extends Mascota {
	private String nombre;
	public Gato(String nombre, String color) {
		super(nombre, color);
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}