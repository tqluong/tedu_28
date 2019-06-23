package inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;

import inventory.model.User;
import inventory.service.UserService;
import inventory.validate.LoginValidator;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private LoginValidator loginValidator;
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		if(binder.getTarget() ==null) return;
		if(binder.getTarget().getClass() ==User.class) {
			binder.setValidator(loginValidator);
		}
	}
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("loginForm", new User());
		return "login/login";
	}
}
