package ua.services;

import ua.entity.Book;
import java.util.List;

public interface BookService {

    Book addBook(Book book);

    void delete(long id);

    Book findOne(long id);

    List<Book> getAll();

}
