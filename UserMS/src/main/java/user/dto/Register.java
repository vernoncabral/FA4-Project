package user.dto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Register {

	@RequestMapping("/registration")
	public String loginpage() {
		return "registration";
	}

}
