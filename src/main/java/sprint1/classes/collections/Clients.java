package sprint1.classes.collections;

import java.util.ArrayList;

import sprint1.classes.Client;

public class Clients {
static ArrayList<Client> listClients=new ArrayList<Client>();
public void addClient(Client cli)
{
listClients.add(cli);

}
public void afficheClients()
{
for(Client cl: listClients)
{
System.out.println(cl.toString());	
}

}
public Client findClientById(int idclient)
{
	for(Client cli:listClients)
	{
		if(cli.getId()==idclient)
			return cli;
	}
	
	
	return null;
	
}
public static ArrayList<Client> getListClients() {
	return listClients;
}
public static void setListClients(ArrayList<Client> listClients) {
	Clients.listClients = listClients;
}




}