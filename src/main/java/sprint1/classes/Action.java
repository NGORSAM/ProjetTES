package sprint1.classes;

public class Action {
	private int id, id_client;
	private String dateheur, type;
	private double montant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	public String getDateheur() {
		return dateheur;
	}

	public void setDateheur(String dateheur) {
		this.dateheur = dateheur;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Action(int id_client, String type, double montant) {
		this.id_client = id_client;
		this.type = type;
		this.montant = montant;
	}

	public Action() {
	}

	@Override
	public String toString() {
		return "Action [id=" + id + ", id_client=" + id_client + ", dateheur=" + dateheur + ", type=" + type
				+ ", montant=" + montant + "]";
	}
	
	
	
}
