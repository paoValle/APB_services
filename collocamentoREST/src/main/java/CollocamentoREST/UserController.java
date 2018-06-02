package CollocamentoREST;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import MVC.User;
import MVC.UserDAO;

@RestController
public class UserController {
	
	private UserDAO udao = new UserDAO();
	
	@GetMapping("/users")
	public List<User> retrieveAllStudents() {
		return udao.gestListaUtenti();
	}
	
	@GetMapping("/test")
	public String test() {
		return "ciao";
	}
}
