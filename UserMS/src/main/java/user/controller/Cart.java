package user.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Cart {

	@RequestMapping("/cart")
	public String cartpage() {
		return "Cart";
	}
}