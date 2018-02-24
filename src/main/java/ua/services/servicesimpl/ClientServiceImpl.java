package ua.services.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.entity.Book;
import ua.entity.Client;
import ua.repository.BookRepository;
import ua.repository.ClientRepository;
import ua.services.BookService;
import ua.services.ClientService;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client addClient(Client client) {
        Client saveClient = clientRepository.saveAndFlush(client);
        return saveClient;
    }

    @Override
    public void delete(long id) {
        clientRepository.delete(id);
    }

    @Override
    public Client findOne(long id) {
        return clientRepository.findOne(id);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}
