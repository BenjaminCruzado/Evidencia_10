package Caso2;
public class Moto {
	private String marca;
	private String modelo;
	private Persona persona;
	public Moto(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.persona = null;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}