package MVC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDAO {
	private HashMap<String, User> users = new HashMap<>();
	UserDAO instance = null;
	
	public UserDAO getInstance() {
		if (instance==null)
			instance = new UserDAO();	
		return instance;
	}
	
	public UserDAO() {
		users.put("VLLTPL947", new User("Paolo", "Valletta", "VLLTPL947", "25/02/1994", "Impiegato", "Disoccupato"));
		users.put("GLLNTN94", new User("Antonio", "Galli", "GLLNTN94", "11/05/1994", "Manager", "Disoccupato"));
		users.put("GRVMHL94", new User("Michela", "Gravina", "GRVMHL94", "30/11/1994", "Prof.re Ordinario", "Disoccupato"));
		users.put("VFGVN94", new User("Virginia", "Venezia", "VFGVN94", "02/08/1994", "Soldato Semplice", "Disoccupato"));

	}

	public List<User> getUsers() {
		return new ArrayList<User>(users.values());
	}

	public User getUterByCf(String cf) {
		return (User)users.get(cf);
	}
	
	public boolean addUser(User u) {
		if (users.containsKey(u.getCfis()))
			return false;
		else
			users.put(u.getCfis(), u);
		return true;
	}
}
