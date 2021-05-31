package sprint1.dao;

import java.sql.SQLException;

import sprint1.classes.Action;

public class ActionDao {
	Action action;

	public void saveAction(Action action) {
		System.out.println(action.toString() + " ajouté avec succés");
	}

	public void addAction() {
		action = new Action(1, "retrait", 20);
		try {
			// TODO add your handling code here:
			Connexion c = new Connexion();
			java.sql.PreparedStatement statement = c.conn
					.prepareStatement("INSERT INTO `actions`(  `montant`, `type`, `id_client`) VALUES ('"
							+ action.getId_client() + "','" + action.getMontant() + "','" + action.getType() + "')");
			statement.executeUpdate();
			System.out.println("ajouté avec succés");
		} catch (SQLException ex) {
			System.out.println(ex);

		}
	}
}