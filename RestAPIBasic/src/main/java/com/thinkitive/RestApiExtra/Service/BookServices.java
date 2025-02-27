package com.thinkitive.RestApiExtra.Service;

import com.thinkitive.RestApiExtra.Entity.Book;


public interface BookServices {

    Book addBook(Book book);

    Book getBookById(int id);

    String deleteById(int id);

    String updateBook(int id,String author);

}
