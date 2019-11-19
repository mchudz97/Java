package ug.edu.pl;
import ug.edu.pl.domain.Author;
import ug.edu.pl.domain.Book;
import ug.edu.pl.service.AuthorService;
import ug.edu.pl.service.AuthorServiceJDBC;
import ug.edu.pl.service.BookServiceJDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BazaKsiazek {
    public static void main(String[] args) throws SQLException {

        AuthorServiceJDBC as= new AuthorServiceJDBC();

        List<Author> check=as.getAuthorsByNameBeginning("J");;
        for (Author a: check) {
            System.out.println(a);
        }
        /*Author jan= new Author("a","b", 22, 5,1990);

        BookServiceJDBC bs= new BookServiceJDBC();
        Book ks1= new Book("fajna", "Bekowo", 22,5,1990,1);
        Book ks2= new Book("f", "B", 25,5,1940,1);
        bs.addBook(ks1);
        bs.updateBook(1, ks2 );
        List<Book> ball=bs.getBooks();
        List<Book> books=bs.getFromAuthor(1);

        for (Book a: ball) {
            System.out.println(a);
        }

        ArrayList<Author> AuthorsList= new ArrayList<Author>(0);

        Author a1= new Author("Jan", "Kowalski", 10,10,2000);
        Author a2= new Author("Adam", "Nowak", 3,5,1949);
        Author a3= new Author("Michał", "Polak", 23,1,1919);

        AuthorsList.add(a1);
        AuthorsList.add(a2);
        AuthorsList.add(a3);

        as.addAuthors(AuthorsList);
        as.updateAuthor(12,jan);
        List<Author> check=as.getAuthors();
        for (Author a: check) {
            System.out.println(a);
        }*/

    }
}
