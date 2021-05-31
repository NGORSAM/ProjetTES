package sprint1.testes;

public class Validation {
	public boolean validaccess(String accessdata) {
		if (accessdata.length() >= 12) {
			return true;
		} else
			return false;

	}

	public boolean verifchaine(String ch) {
		return !ch.isBlank();
	}

	public boolean verifmail(String mail) {
		if (mail.contains(".") && (mail.contains("@"))) {
			return true;

		} else
			return false;
	}

	public boolean veriftel(String tel) {
		return tel.startsWith("+");
	}

	public boolean verifcode(int code) {
		String verification = String.valueOf(code); // convertir en chaine
		return verification.startsWith("282");
	}

	public boolean verifmontant(double montant) {
		return montant > 20;

	}

	public boolean veriftype(String type) {
		return ((type.equals("retrait")) || (type.equals("versement")));

	}

	public boolean verifaction(double montant, double solde) {
		return montant <= solde;

	}

	public int convertInt(String x) {
		return Integer.parseInt(x);

	}

	public double convertDouble(String y) {
		return Double.parseDouble(y);
	}

}