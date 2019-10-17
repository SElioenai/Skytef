package skytef.fidelidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import skytef.fidelidade.model.User;
import skytef.fidelidade.service.UserService;

public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public ModelAndView clientList() {
		ModelAndView mv = new ModelAndView("user_list");
		List<User> user = UserService.listAll();
		mv.addObject("user", user);
		mv.addObject(new User());
		return mv;
	}

	@PostMapping
	public String save(User user) {
		userService.saveUser(user);
		return "redirect:/user";
	}
}
