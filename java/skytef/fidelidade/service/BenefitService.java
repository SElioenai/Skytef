package skytef.fidelidade.service;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import skytef.fidelidade.model.Benefit;
import skytef.fidelidade.repository.BenefitRepository;
import skytef.fidelidade.repository.JPAUtil;

@Service
public class BenefitService {
	@Autowired
	private BenefitRepository benefitRepo;
//	
	public void addBenefit(Benefit benefit) {
//		EntityManager manager = JPAUtil.getEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		transaction.begin();
		benefitRepo.save(benefit);
//		Long id = Long.valueOf(new Random().nextLong());
//		Benefit bnf = new Benefit();
//		bnf.setId_benefit(id);
//		bnf.setName(benefit.getName());
//		bnf.setPoint(benefit.getPoint());
//		bnf.setType(benefit.getType());
//		manager.persist(bnf);
//		transaction.commit();
//		manager.close();
//		JPAUtil.close();
	}
	public List<Benefit> listAll() {
		List<Benefit> benefit = (List<Benefit>) benefitRepo.findAll();
		return benefit;
	}
//	public void updateClient(Benefit benefit) {
//		benefitRepo.flush();
	}

