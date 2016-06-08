package aeronautique;

public class Avion {

	private int numeroAvion;
	private String nomAvion;
	private String localisationAvion;
	private int capaciteAvionnumero;
	
	
	public int getNumeroAvion() {
		return numeroAvion;
	}
	
	protected Avion(int numeroAvion, String nomAvion, String localisationAvion, int capaciteAvionnumero) {
		super();
		this.numeroAvion = numeroAvion;
		this.nomAvion = nomAvion;
		this.localisationAvion = localisationAvion;
		this.capaciteAvionnumero = capaciteAvionnumero;
	}


	@Override
	public String toString() {
		return "Avion [numeroAvion=" + numeroAvion + ", nomAvion=" + nomAvion + ", localisationAvion="
				+ localisationAvion + ", capaciteAvionnumero=" + capaciteAvionnumero + "]";
	}



}



