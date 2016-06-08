package aeronautique;

public class Avion {
/**
 * Attributs de notre Classe Avion
 */
	private int numeroAvion;
	private String nomAvion;
	private String localisationAvion;
	private int capaciteAvion;
	private int enPlus;
	
	public int getNumeroAvion() {
		return numeroAvion;
	}
	
	protected Avion(int numeroAvion, String nomAvion, String localisationAvion, int capaciteAvionnumero) {
		super();
		this.numeroAvion = numeroAvion;
		this.nomAvion = nomAvion;
		this.localisationAvion = localisationAvion;
		this.capaciteAvion = capaciteAvionnumero;
		this.enPlus =15;
	}


	@Override
	public String toString() {
		return "Avion [numeroAvion=" + numeroAvion + ", nomAvion=" + nomAvion + ", localisationAvion="
				+ localisationAvion + ", capaciteAvionnumero=" + capaciteAvion + "]";
	}

	public int getCapaciteAvion() {
		return capaciteAvion;
	}

	public void setCapaciteAvion(int capaciteAvionnumero) {
		this.capaciteAvion = capaciteAvionnumero;
	}



}



