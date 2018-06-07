package CollocamentoREST;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import MVC.User;
import MVC.UserDAO;

@RestController
public class UserController {
	
	private UserDAO udao = new UserDAO();
	
	@GetMapping("/users/all")
	public List<User> retrieveAllStudents() {
		return udao.getUsers();
	}

	@GetMapping("/users/{cf}")
	public User getUserById(@PathVariable("cf") String cf) {
		return udao.getUterByCf(cf);
	}

	@PostMapping("/users/add")
	public boolean addUser(@RequestBody User user) {
		return udao.addUser(user);
	}
}
