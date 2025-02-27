package com.thinkitive.RestApiExtra.Service;

import com.thinkitive.RestApiExtra.BookRepository.BookRepository;
import com.thinkitive.RestApiExtra.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceIMP implements BookServices {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(int id) {
        Optional<Book> optional = bookRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    public List<Book> bookList(){
        List<Book> bookList=new ArrayList<>();
        for(Book book:bookRepository.findAll()){
            bookList.add(book);
        }
       return bookList;
    }

    @Override
    public String deleteById(int id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
            return "Deleted successfully";
        }
        return "Id Not Found";
    }

    @Override
    public String updateBook(int id, String author) {
               Book book =getBookById(id);
            if(book!=null){
                book.setAuthor(author);
                bookRepository.save(book);
                return "updated successfully";
            }
            return "book not found";
    }
}

