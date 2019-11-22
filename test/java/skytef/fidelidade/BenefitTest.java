package skytef.fidelidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import skytef.fidelidade.model.Benefit;
import skytef.fidelidade.repository.JPAUtil;

public class BenefitTest {
	
		public static void main(String[] args) {
			EntityManager manager = JPAUtil.getEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			Benefit u = new Benefit();
			u.setName("BenefitTest");
			u.setCompany("CompanyTest");
			u.setPoint("PointTest");
			u.setType("TypeTest");
			manager.persist(u);
			transaction.commit();
			manager.close();
			JPAUtil.close();
		}
	}

