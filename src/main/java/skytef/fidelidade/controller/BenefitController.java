package skytef.fidelidade.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import skytef.fidelidade.model.Benefit;
import skytef.fidelidade.repository.BenefitRepository;
import skytef.fidelidade.service.BenefitService;

public class BenefitController {
	@Autowired
	private BenefitService benefitService;
	
	@Autowired
	private BenefitRepository benefitRepository;

	@GetMapping("/isWorking")
	public String getResponse() {
		return "isWorking : True";
	}
	@GetMapping("/benefits")
	public List<Benefit> getAllBenefitList() {
		//		ModelAndView mv = new ModelAndView("benefit_list");
		//		List<Benefit> benefit = (List<Benefit>) benefitRepository.findAll();
		//		mv.addObject("benefit", benefit);
		//		mv.addObject(new Benefit());
		//		return mv;
//		Iterable<Benefit> benefit = benefitService.listAll();
		Iterable<Benefit> benefit = benefitRepository.findAll();
		List<Benefit> benefitList = new ArrayList<Benefit>();
		benefit.forEach(benefitList::add);
		return benefitList;
	}

	@PostMapping("/benefit")
	public Benefit addBenefit(Benefit benefit) {
		Long id = Long.valueOf(new Random().nextLong());
		Benefit bnf = new Benefit(id, 
				benefit.getType(), 
				benefit.getName(), 
				benefit.getPoint(),
				benefit.getCompany());
		benefitRepository.save(bnf);
//		return "redirect:/benefit";
		return bnf;
	}
}
