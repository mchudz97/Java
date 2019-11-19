package ug.edu.pl.service
import org.junit.*
import ug.edu.pl.domain.Author
import ug.edu.pl.domain.Book

class BookServiceJDBCTest extends GroovyTestCase {

    @Test
    void testDropBook(){
        BookServiceJDBC bs= new BookServiceJDBC();
        assertEquals(0,bs.dropBook());
    }
    void testAddBook() {
        AuthorServiceJDBC aserv= new AuthorServiceJDBC();
        aserv.addAuthor(new Author("A","B",1,1,1111));
        Book b= new Book("A","B",22,11,1990,1);
        BookServiceJDBC bs= new BookServiceJDBC();
        assertEquals(1, bs.addBook(b));
    }

    void testGetBooks() {
        BookServiceJDBC bs= new BookServiceJDBC();
        Assert.assertNotNull(bs.getBooks());
    }

    void testAddBooks() {
        AuthorServiceJDBC aserv= new AuthorServiceJDBC();
        aserv.addAuthor(new Author("A","B",1,1,1111));
        Book b1= new Book("A","B",22,11,1990,1);
        Book b2= new Book("A","B",22,11,1990,1);
        Book b3= new Book("A","B",22,11,1990,1);
        List<Book> blist= new ArrayList<Book>(0);
        blist.addAll(b1,b2,b3);
        BookServiceJDBC bs= new BookServiceJDBC();
        assertEquals(blist.size(), bs.addBooks(blist));

    }
    void testGetFromAuthor(){
        BookServiceJDBC bs= new BookServiceJDBC();
        Assert.assertNotNull(bs.getFromAuthor(1));
    }


}
