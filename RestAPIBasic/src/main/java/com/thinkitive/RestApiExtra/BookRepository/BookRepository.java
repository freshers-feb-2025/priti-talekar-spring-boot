package com.thinkitive.RestApiExtra.BookRepository;

import com.thinkitive.RestApiExtra.Entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {
}
