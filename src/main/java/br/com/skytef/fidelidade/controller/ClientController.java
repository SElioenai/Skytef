package skytef.fidelidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import skytef.fidelidade.model.Client;
import skytef.fidelidade.model.PartnerCompany;
import skytef.fidelidade.service.ClientService;

public class ClientController {
	@Autowired
	private ClientService clientService;

	@GetMapping(value = {"/client"})
	public ModelAndView clientList() {
		ModelAndView mv = new ModelAndView("cadastroVendedor");
		List<Client> client = clientService.listAll();
		mv.addObject("client", client);
		mv.addObject(new Client());
		return mv;
	}
	
	@GetMapping(value = {"/company"})
	public ModelAndView companyList() {
		ModelAndView mv = new ModelAndView("EmpresasCadastradas");
		mv.addObject(new PartnerCompany());
		return mv;
	}

	@PostMapping("/clients")
	public String save(Client client) {
		clientService.saveClient(client);
		return "redirect:/client";
	}
}