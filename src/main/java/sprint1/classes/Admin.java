package sprint1.classes;

public class Admin {
	private int id;
	private String login, mdp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public Admin() {
	}

	public Admin(String login, String mdp) {
		this.login = login;
		this.mdp = mdp;
	}

}