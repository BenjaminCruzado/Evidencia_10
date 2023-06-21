package Caso2;
import java.util.ArrayList;

public class Casa {
	private int numeroDeCasa;
	private ArrayList<Persona> persona = new ArrayList<Persona>();
	private Condominio condominio;
	public Casa(int numeroDeCasa) {
		this.numeroDeCasa = numeroDeCasa;
		this.persona = new ArrayList<Persona>();
		this.condominio = null;
	}

	public int getNumeroDeCasa() {
		return this.numeroDeCasa;
	}

	public void setNumeroDeCasa(int numeroDeCasa) {
		this.numeroDeCasa = numeroDeCasa;
	}
}