package ua.services.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.entity.Book;
import ua.entity.Rent;
import ua.repository.BookRepository;
import ua.repository.RentRepository;
import ua.services.BookService;
import ua.services.RentService;

import java.util.List;

@Service
public class RentServiceImpl implements RentService {

    @Autowired
    private RentRepository rentRepository;

    @Override
    public Rent addRent(Rent book) {
        Rent saveBook = rentRepository.saveAndFlush(book);
        return saveBook;
    }

    @Override
    public void delete(long id) {
        rentRepository.delete(id);
    }

    @Override
    public Rent findOne(long id) {
        return rentRepository.findOne(id);
    }

    @Override
    public List<Rent> getAll() {
        return rentRepository.findAll();
    }
}
