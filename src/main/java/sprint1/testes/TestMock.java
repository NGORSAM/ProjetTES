package sprint1.testes;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import sprint1.dao.ActionDao;
import sprint1.dao.ClientDao;
import sprint1.services.ClientService;
import sprint1.classes.Action;
import sprint1.classes.Client;
import sprint1.services.ActionService;

public class TestMock {
	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}

	@InjectMocks
	ActionService actservice;
	@InjectMocks
	ClientService clservice;
	@Mock
	ActionDao act;
	@Mock
	ClientDao cl;

	@Test
	public void addClient() {
		Client cli = new Client("pierre", "teste", "pierre@gmail.com", "USA", "+016667778", 282334654, 2000);
		boolean etat = clservice.saveClient(cli);
		assertTrue(etat);
		verify(cl, times(0)).saveClient(cli);
	}

@Test
public void addAction()
{
	Client cli = new Client("pierre", "teste", "pierre@gmail.com", "USA", "+016667778", 282334654, 2000);

Action	ac=new Action(1, "versement",600);
boolean state=actservice.saveAction(cli, ac);
assertTrue(state);

}
}