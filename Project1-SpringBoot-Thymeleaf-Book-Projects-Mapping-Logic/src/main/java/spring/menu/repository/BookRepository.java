package spring.menu.repository;

import org.springframework.stereotype.Repository;
import spring.menu.main.Books;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * @Created 16 / 06 / 2020 - 3:29 PM
 * @project SpringBootMenu
 * @Author Hamdamboy
 */

public class BookRepository {

    private List<Books> books;

    public BookRepository() {
        this.books = new ArrayList<>();
    }

    public BookRepository(List<Books> books){
        this.books = books;
    }

    public List<Books> getBooks () {
        return books;
    }

    public void setBooks(List<Books> books){
        this.books = books;
    }

    public void addBook(Books book) {
        this.books.add(book);
    }

}