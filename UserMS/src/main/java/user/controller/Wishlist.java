package user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Wishlist {

	@RequestMapping("/wishlist")
	public String wishlistpage() {
		return "Registration";
	}
}
