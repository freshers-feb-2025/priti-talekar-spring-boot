package com.thinkitive.RestApiExtra.Service;

import com.thinkitive.RestApiExtra.Entity.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookService {

    private static List<Book> list=new ArrayList<>();

    static {
        list.add(new Book(101,"Head first Java","James Gosling"));
        list.add(new Book(102,"Don Quixote",	"Miguel de Cervantes"));
        list.add(new Book(103,"Alice's Adventures in Wonderland","Lewis Carroll"));
    }

    public List<Book> bookList(){
        return list;
    }

    public Book getBookById(int id){
            for(Book book:list){
                if(book.getBookId()==id){
                    return book;
                }
            }
          return null;
    }

    public Book addBook(Book b){
      list.add(b);
      return b;
    }

    public String deleteBook(int id){
        for(Book book:list){
            if(book.getBookId()==id){
                list.remove(book);
                return "Removed Sucessfully";
            }
        }
        return "Not Found";
    }


    public void updateBook(Book book,int id)
    {
        for(Book b:list){
            if(b.getBookId()==id){
                b.setBookTitle(book.getBookTitle());
                b.setAuthor(book.getAuthor());
            }
        }
    }
}
