package sprint1.services;

import sprint1.classes.Client;
import sprint1.testes.Validation;

public class ClientService {
	Client client;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public boolean saveClient(Client cl) {
		Validation valid = new Validation();
		if ((valid.verifchaine(cl.getNom()) && (valid.verifmail(cl.getEmail())))
				&& (valid.verifcode(cl.getCodeapplication())) && (valid.veriftel(cl.getTelephone()))) {
			System.out.println("ajout avec succés");
			return true;
		}
		return false;

	}

}