package ua.services.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.entity.Client;
import ua.entity.CopyOfBook;
import ua.repository.ClientRepository;
import ua.repository.CopyOfBookRepository;
import ua.services.ClientService;
import ua.services.CopyOfBookService;

import java.util.List;

@Service
public class CopyOfBookServiceImpl implements CopyOfBookService {

    @Autowired
    private CopyOfBookRepository copyOfBookRepository;

    public CopyOfBook addCopyOfBook(CopyOfBook copyOfBook) {
        CopyOfBook saveClient = copyOfBookRepository.saveAndFlush(copyOfBook);
        return saveClient;
    }

    @Override
    public void delete(long id) {
        copyOfBookRepository.delete(id);
    }

    @Override
    public CopyOfBook findOne(long id) {
        return copyOfBookRepository.findOne(id);
    }

    @Override
    public List<CopyOfBook> getAll() {
        return copyOfBookRepository.findAll();
    }
}
