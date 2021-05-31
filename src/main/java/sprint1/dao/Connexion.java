package sprint1.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
Connection conn;
{


String url= "jdbc:mysql://localhost:3306/";
String dbName;
dbName = "BANQUE"; //nom de la base
String driver= "com.mysql.jdbc.Driver";
String userName= "admin";
String password="formation";
try
{
	conn= DriverManager.getConnection(url+dbName,userName, password);

Class.forName(driver).newInstance();
System.out.println("la connexion a reussie");
}catch(Exception e)
{
System.out.println("la connexion est echoué");
}
}
}
