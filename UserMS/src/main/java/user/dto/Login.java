package user.dto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {

	@RequestMapping("/login")
	public String loginpage() {
		return "login";
	}
}
