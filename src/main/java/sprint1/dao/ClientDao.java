package sprint1.dao;

import java.sql.SQLException;

import sprint1.classes.Client;

public class ClientDao {

	public Client client;

	public void saveClient(Client client) {
		System.out.println(client.toString() + " ajouté avec succés");

	}

	public void addclient() {
		client = new Client("teste2", "teste2", "teste2@gmail.com", "teste2 ville", "+3337889902", 282345678, 20000);
		try {
			// TODO add your handling code here:
			Connexion c = new Connexion();
			java.sql.PreparedStatement statement = c.conn.prepareStatement(
					"INSERT INTO `client`( `nom`, `prenom`, `email`, `adresse`, `telephone`, `codeapplication`, `solde`) VALUES ('"
							+ client.getNom() + "','" + client.getPrenom() + "','" + client.getEmail() + "','"
							+ client.getAdresse() + "','" + client.getTelephone() + "','" + client.getCodeapplication()
							+ "','" + client.getSolde() + "')");
			statement.executeUpdate();
			System.out.println("ajouté avec succés");
		} catch (SQLException ex) {
			System.out.println(ex);

		}

	}

}