package ua.services;

import ua.entity.Book;
import ua.entity.Genre;

import java.util.List;

public interface GenreService {

    Genre addGenre(Genre genre);

    void delete(long id);

    Genre findOne(long id);

    List<Genre> getAll();

}
