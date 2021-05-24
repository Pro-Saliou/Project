package com.example.Repositories;

import com.example.models.*;
import java.util.*;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}