package user.dto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Inactive {

	@RequestMapping("/cart")
	public String loginpage() {
		return "cart";
	}
}
