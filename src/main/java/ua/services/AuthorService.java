package ua.services;

import ua.entity.Author;
import ua.entity.Book;

import java.util.List;

public interface AuthorService {

    Author addBook(Author author);

    void delete(long id);

    Author findOne(long id);

    List<Author> getAll();

}
