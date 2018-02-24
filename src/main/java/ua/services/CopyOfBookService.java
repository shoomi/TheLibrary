package ua.services;

import ua.entity.Book;
import ua.entity.CopyOfBook;

import java.util.List;

public interface CopyOfBookService {

    CopyOfBook addCopyOfBook(CopyOfBook copyOfBook);

    void delete(long id);

    CopyOfBook findOne(long id);

    List<CopyOfBook> getAll();

}
