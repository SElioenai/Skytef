package skytef.fidelidade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import skytef.fidelidade.model.Benefit;
import skytef.fidelidade.repository.BenefitRepository;


public class BenefitService {
	@Autowired
	private BenefitRepository benefitRepo;
//	
//	public void saveBenefit(Benefit benefit) {
//		benefitRepo.saveAndFlush(benefit);
//	}
//	public List<Benefit> listAll() {
//		List<Benefit> benefit = benefitRepo.findAll();
//		return benefit;
//	}
//	public void updateClient(Benefit benefit) {
//		benefitRepo.flush();
	}

