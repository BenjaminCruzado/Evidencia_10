package Caso1;
public class Perro extends Mascota {
	private String nombre;
	private String color;
	public Perro(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}

	public void ladrar() {
		System.out.println("¡Guau guau!");
	}

	public void comer() {
		System.out.println("El perro está comiendo.");
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

	public void getAttribute() {
		throw new UnsupportedOperationException();
	}

	public void setAttribute(Object attribute) {
		throw new UnsupportedOperationException();
	}
}