package ug.edu.pl.service;

import ug.edu.pl.domain.Book;

import java.util.List;

public interface BookService {
    public int addBook(Book b);
    public List<Book> getBooks();
    public int addBooks(List<Book> books);
}
