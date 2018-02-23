package ua.services.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.entity.Book;
import ua.repository.BookRepository;
import ua.services.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        Book saveBook = bookRepository.saveAndFlush(book);
        return saveBook;
    }

    @Override
    public void delete(long id) {
        bookRepository.delete(id);
    }

    @Override
    public Book findOne(long id) {
        return bookRepository.findOne(id);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
