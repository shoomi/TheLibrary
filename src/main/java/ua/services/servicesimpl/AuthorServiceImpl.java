package ua.services.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.entity.Author;
import ua.entity.Book;
import ua.repository.AuthorRepository;
import ua.repository.BookRepository;
import ua.services.AuthorService;
import ua.services.BookService;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author addBook(Author book) {
        Author author = authorRepository.saveAndFlush(book);
        return author;
    }

    @Override
    public void delete(long id) {
        authorRepository.delete(id);
    }

    @Override
    public Author findOne(long id) {
        return authorRepository.findOne(id);
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }
}
