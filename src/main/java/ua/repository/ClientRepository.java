package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.entity.Book;
import ua.entity.Client;
import java.time.LocalDate;


public interface ClientRepository extends JpaRepository<Client, Long>{

    /**
     * Task 3.1
     */
    Book whichBookDidTakeTheClient(String login);

    /**
     * Task 3.2
     */
    Book whichBooksClientDidntReturn(String login);

    /**
     * Task 3.3
     */
    LocalDate howMuchTimeTheClientUseTheLibrary(String login);



}