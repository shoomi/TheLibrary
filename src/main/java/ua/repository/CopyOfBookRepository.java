package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import ua.entity.CopyOfBook;


public interface CopyOfBookRepository extends JpaRepository<CopyOfBook, Long>{

}