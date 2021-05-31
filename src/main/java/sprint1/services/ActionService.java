package sprint1.services;

import sprint1.classes.Action;
import sprint1.classes.Client;
import sprint1.dao.ActionDao;
import sprint1.testes.Validation;

public class ActionService {
	ActionDao action;

	public ActionDao getAction() {
		return action;
	}

	public void setAction(ActionDao action) {
		this.action = action;
	}

	public boolean saveAction(Client cl, Action ac) {
		Validation valid = new Validation();
		if ((valid.verifaction(cl.getSolde(), ac.getMontant())) && (valid.verifmontant(ac.getMontant()))
				&& (valid.veriftype(ac.getType())))

		{
			return true;
		}
		return false;

	}
}