package skytef.fidelidade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import skytef.fidelidade.model.Client;
import skytef.fidelidade.repository.ClientRepository;

public class ClientService {
	@Autowired
	private ClientRepository clientRepo;
	
	public void saveClient(Client client) {
		clientRepo.saveAndFlush(client);
	}
	public List<Client> listAll() {
		List<Client> client = clientRepo.findAll();
		return client;
	}
	public void updateClient(Client client) {
		clientRepo.save(client);
	}
	public void findAllClientbyId(Client client) {
		clientRepo.findAll();
	}
	public void findClientbyId(Client client) {
		clientRepo.findById(client.getClient_id());
	}

}
