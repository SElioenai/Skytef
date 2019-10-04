package skytef.fidelidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import skytef.fidelidade.model.Client;
import skytef.fidelidade.service.ClientService;

public class ClientController {
	@Autowired
	private ClientService clientService;

	@GetMapping("/client")
	public ModelAndView clientList() {
		ModelAndView mv = new ModelAndView("client_list");
		List<Client> client = clientService.listAll();
		mv.addObject("client", client);
		mv.addObject(new Client());
		return mv;
	}

	@PostMapping
	public String save(Client client) {
		clientService.saveClient(client);
		return "redirect:/client";
	}
}