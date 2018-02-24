package ua.services;

import ua.entity.Book;
import ua.entity.Client;

import java.util.List;

public interface ClientService {

    Client addClient(Client client);

    void delete(long id);

    Client findOne(long id);

    List<Client> getAll();

}
