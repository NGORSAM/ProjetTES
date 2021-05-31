package sprint1.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import sprint1.classes.Admin;

public class AdminDao {
Admin admin;
public boolean authentifier() throws SQLException
{
	admin=new Admin("admin", "admin");
 Connexion c = new Connexion(); //appel de connexion à la BD
   PreparedStatement pst; 
   pst = (PreparedStatement) c.conn.prepareStatement("SELECT * FROM `admin` WHERE `login`='"+admin.getLogin()+"' AND password='"+admin.getMdp()+"' "); // lister les admins
   pst.executeQuery(); // lister les admins
   ResultSet rs = (ResultSet) pst.executeQuery(); // stocker le résultat dans un resultset
   if(rs.next()) {
      // System.out.println(rs.getString("nom")); //teste d’affichage
      return true;
   }
   else
       return false;


}
}