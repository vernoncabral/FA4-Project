package user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BuyerController {
	@RequestMapping("/buyer")
	public String buyerpage() {
		return "Buyer";
	}
}
