package com.thinkitive.RestApiExtra.Controllerr;
import com.thinkitive.RestApiExtra.Entity.Book;
import com.thinkitive.RestApiExtra.Service.BookServiceIMP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookServiceIMP bookServiceIMP;

    @GetMapping("/hello")
    public String Show(){
        return "hello";
    }

    @GetMapping("/books")
    public List<Book> getBooksList(){
         return bookServiceIMP.bookList();
    }

//    @GetMapping("/books/{id}")
//    public Book getBook(@PathVariable int id){
//        return this.bookService.getBookById(id);
//    }

    @GetMapping("/book/")
    public Book getBook(@RequestParam int id){
        return this.bookServiceIMP.getBookById(id) ;
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        System.out.println("book added successfully");
        Book b=bookServiceIMP.addBook(book);

//        return this.bookService.bookList();
//        return getBooksList();
            return b;
    }

    @DeleteMapping("/books/{id}")
    public String deleteBookById(@PathVariable int id){
           return bookServiceIMP.deleteById(id);
    }

    @PutMapping("/books/{id}")
    public String updateBook(@PathVariable int id,@PathVariable String author){
       return bookServiceIMP.updateBook(id,author);
    }

}
