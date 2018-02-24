package ua.services.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.entity.Book;
import ua.entity.Genre;
import ua.repository.BookRepository;
import ua.repository.GenreRepository;
import ua.services.BookService;
import ua.services.GenreService;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public Genre addGenre(Genre book) {
        Genre saveBook = genreRepository.saveAndFlush(book);
        return saveBook;
    }

    @Override
    public void delete(long id) {
        genreRepository.delete(id);
    }

    @Override
    public Genre findOne(long id) {
        return genreRepository.findOne(id);
    }

    @Override
    public List<Genre> getAll() {
        return genreRepository.findAll();
    }
}
