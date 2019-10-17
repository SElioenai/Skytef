package skytef.fidelidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import skytef.fidelidade.model.Benefit;

//public interface BenefitRepository extends JpaRepository<Benefit, Long> {
public interface BenefitRepository extends CrudRepository<Benefit, Long> {
	
}
