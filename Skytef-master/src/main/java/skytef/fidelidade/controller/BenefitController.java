package skytef.fidelidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import skytef.fidelidade.model.Benefit;
import skytef.fidelidade.service.BenefitService;

public class BenefitController {
	@Autowired
	private BenefitService benefitService;

	@GetMapping("/benefit")
	public ModelAndView benefitList() {
		ModelAndView mv = new ModelAndView("benefit_list");
		List<Benefit> benefit = benefitService.listAll();
		mv.addObject("benefit", benefit);
		mv.addObject(new Benefit());
		return mv;
	}

	@PostMapping
	public String save(Benefit benefit) {
		benefitService.saveBenefit(benefit);
		return "redirect:/benefit";
	}
}
