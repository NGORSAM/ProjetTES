package sprint1.testes;


import java.sql.SQLException;
import sprint1.dao.ActionDao;
import sprint1.dao.AdminDao;
import sprint1.dao.ClientDao;
import sprint1.dao.Connexion;

//tested
public class TestDb {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
Connexion c=new Connexion();
ClientDao cd=new ClientDao();
cd.addclient();
ActionDao ad=new ActionDao();
ad.addAction();
AdminDao admin=new AdminDao();
System.out.println(admin.authentifier());
	}

}
