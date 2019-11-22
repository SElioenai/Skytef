package skytef.fidelidade.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import skytef.fidelidade.model.User;
import skytef.fidelidade.service.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping(value = {"/users"})
	public ModelAndView clientList() {
		ModelAndView mv = new ModelAndView("cadastroUser");
		List<User> users = userService.listAll();
		mv.addObject("users", users);
		mv.addObject(new User());
		return mv;
	}

	@PostMapping("/user")
	public String save(User user) {
//		Long id = Long.valueOf(new Random().nextLong());
//		User us = new User(id,
//				user.getName(),
//				user.getPassword());
		userService.saveUser(user);
		return "redirect:/users";
//		return us;
	}
}
