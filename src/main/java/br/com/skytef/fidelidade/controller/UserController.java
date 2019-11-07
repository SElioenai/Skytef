package br.com.skytef.fidelidade.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.skytef.fidelidade.model.User;
import br.com.skytef.fidelidade.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/users")
	public List<User> getAllUsertList() {
//		ModelAndView mv = new ModelAndView("user_list");
//		List<User> user = (List<User>) userRepository.findAll();
//		mv.addObject("user", user);
//		mv.addObject(new User());
//		return mv;
		Iterable<User> user = userRepository.findAll();
		List<User> userList = new ArrayList<User>();
		user.forEach(userList::add);
		return userList;
	}

	@PostMapping("/user")
	public User save(@RequestBody User user) {
//		Integer id = Integer.valueOf(new Random().nextLong());
//		User us = new User(
//				user.getName(),
//				user.getPassword());
//		userRepository.save(user);
//		return "redirect:/user";
		return userRepository.save(user);
	}
}
