package sprint1.classes.collections;

import java.util.ArrayList;

import sprint1.classes.Action;

public class Actions {
static ArrayList<Action> listActions=new ArrayList<Action>();
void addAction(Action act)

{
listActions.add(act);	

}
static void listerAction()
{
for(Action ac: listActions)
{
System.out.println(ac.toString());	

}
}
public void findByClient(int idclient)
{
	
for(Action ac: listActions)
	if(ac.getId_client()==idclient)
	{
		System.out.println(ac.toString());
	}

}
}