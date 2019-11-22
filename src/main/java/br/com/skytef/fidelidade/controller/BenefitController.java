package skytef.fidelidade.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import skytef.fidelidade.model.Benefit;
import skytef.fidelidade.repository.BenefitRepository;
import skytef.fidelidade.service.BenefitService;

@Controller
public class BenefitController {
	
	@Autowired
	private BenefitRepository benefitRepository;
	
	@Autowired
	private BenefitService service;

	@GetMapping("/isWorking")
	public String getResponse() {
		return "isWorking : True";
	}
	@GetMapping(value= {"/benefits"})
	public ModelAndView getAllBenefitList(Benefit benefit) {
//		HttpSession session = request.getSession();
//		if(session.getAttribute("user") != null) {
			ModelAndView mv = new ModelAndView("cadastroPontos");
			List<Benefit> benefits = service.listAll();
			mv.addObject("benefits", benefits);
			mv.addObject(new Benefit());
			return mv;
		}
//			else {
//			ModelAndView mv = new ModelAndView("CadastroPontos");
//			mv.addObject(new Benefit());
//			return mv;
//		}
//	}

	@PostMapping(value = {"/benefit"})
	public String addBenefit(Benefit benefit) {
//		if (benefitRepository.save(benefit) != null) {
//			request.getSession().setAttribute("benefit", benefit);
			service.addBenefit(benefit);
			return "redirect:/benefits";
//		} else {
//			return "benefit";
		}
	}
		
//		
//		benefitRepository.save(benefit);
////		return "redirect:/benefit";
//		return bnf;
