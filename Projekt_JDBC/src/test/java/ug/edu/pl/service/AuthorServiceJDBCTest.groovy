package ug.edu.pl.service

import org.junit.*
import ug.edu.pl.domain.Author

class AuthorServiceJDBCTest extends GroovyTestCase {
    @Test

    void testDropAuthor(){
        AuthorServiceJDBC authserv= new AuthorServiceJDBC();
        assertEquals(0,authserv.dropAuthor());
    }

    void testAddAuthor() {
        Author a= new Author("Jan", "Brzeg", 11, 1,1990);
        AuthorServiceJDBC authserv= new AuthorServiceJDBC();
        assertEquals(1, authserv.addAuthor(a));

    }

    void testGetAuthors(){
        AuthorServiceJDBC authserv= new AuthorServiceJDBC();
        Assert.assertNotNull(authserv.getAuthors());
    }
    void testGetAuthorsByBeginning(){
        AuthorServiceJDBC authserv= new AuthorServiceJDBC();
        Assert.assertNotNull(authserv.getAuthorsByNameBeginning(""));
    }

    void testAddAuthors() {

            Author a= new Author("Jan", "Brzeg", 11, 1,1990);
            Author b= new Author("Jan", "Brzeg", 11, 1,1990);
            Author c= new Author("Jan", "Brzeg", 11, 1,1990);
            List<Author> list= new ArrayList<Author>(0);
            list.addAll(a,b,c);
            AuthorServiceJDBC authserv= new AuthorServiceJDBC();
            assertEquals(list.size(), authserv.addAuthors(list));


    }
}
