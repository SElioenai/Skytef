package skytef.fidelidade.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import skytef.fidelidade.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	public Optional<Client> findById(Long idClient);
}
