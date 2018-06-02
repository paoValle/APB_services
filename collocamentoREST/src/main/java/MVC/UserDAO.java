package MVC;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	private List<User> users = new ArrayList();
	
	public UserDAO() {
		users.add(new User("Paolo", "Valletta", "VLLPLA94", "25/02/1994", "Impiegato", "Disoccupato"));
		users.add(new User("Antonio", "Galli", "ANTGLL94", "11/05/1994", "Manager", "Disoccupato"));
		users.add(new User("Michela", "Gravina", "MCLGR94", "30/11/1994", "Prof.re Ordinario", "Disoccupato"));
		users.add(new User("Virginia", "Venezia", "VFGVN94", "02/08/1994", "Soldato Semplice", "Disoccupato"));

	}

	public List<User> gestListaUtenti() {
		return users;
	}
}
