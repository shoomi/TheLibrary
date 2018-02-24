package ua.services;

import ua.entity.Book;
import ua.entity.Rent;

import java.util.List;

public interface RentService {

    Rent addRent(Rent rent);

    void delete(long id);

    Rent findOne(long id);

    List<Rent> getAll();

}
