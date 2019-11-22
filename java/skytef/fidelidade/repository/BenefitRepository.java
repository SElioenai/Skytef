package skytef.fidelidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import skytef.fidelidade.model.Benefit;

@Repository
public interface BenefitRepository extends JpaRepository<Benefit, Long> {
	
}
