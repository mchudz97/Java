package ug.edu.pl.domain

import org.junit.Test

import static junit.framework.TestCase.assertEquals
import static junit.framework.TestCase.assertEquals
import static junit.framework.TestCase.assertEquals
import static junit.framework.TestCase.assertEquals

class BookTest extends GroovyTestCase {

    @Test
    public void Book_Check_Full_Date(){
        Book b= new Book("TestBook", "Tests", 11,11,1990,1);
        assertEquals("1990-11-11",b.getDate());

    }

    public void Book_Check_Date_Day(){
        Book b= new Book("TestBook", "Tests", 1,11,1990,1);
        assertEquals("01", b.getDate().substring(8,10));
    }

    public void Book_Check_Date_Month(){
        Book b= new Book("TestBook", "Tests", 1,5,1990,1);
        assertEquals("05", b.getDate().substring(5,7));
    }

    void testGetId() {
        Book a = new Book(1, "A", "B", 11, 11, 1990, 1);
        assertEquals(1, a.getId());
    }

    void testSetId() {
        Book a = new Book(1, "A", "B", 11, 11, 1990, 1);
        a.setId(100);
        assertEquals(100,a.getId());
    }
    void testGetTitle() {
        Book a = new Book(1, "A", "B", 11, 11, 1990, 1);
        assertEquals("A", a.getTitle());
    }

    void testSetTitle() {
        Book a = new Book(1, "A", "B", 11, 11, 1990, 1);
        a.setTitle("C");
        assertEquals("C", a.getTitle());
    }

    void testGetPublishing() {
        Book a = new Book(1, "A", "B", 11, 11, 1990, 1);
        assertEquals("B", a.getPublishing());
    }

    void testSetPublishing() {
        Book a = new Book(1, "A", "B", 11, 11, 1990, 1);
        a.setPublishing("C");
        assertEquals("C", a.getPublishing());
    }

    void testGetDd() {
        Book a = new Book(1, "A", "B", 11, 11, 1990, 1);
        assertEquals(11, a.getDd());
    }

    void testSetDd() {
        Book a = new Book(1, "A", "B", 11, 11, 1990, 1)
        a.setDd(30);
        assertEquals(30, a.getDd())
    }

    void testGetMm() {
        Book a = new Book(1, "A", "B", 11, 11, 1990, 1)
        assertEquals(11, a.getMm());
    }

    void testSetMm() {
        Book a = new Book(1, "A", "B", 11, 11, 1990, 1)
        a.setMm(1);
        assertEquals(1, a.getMm());
    }

    void testGetYyyy() {
        Book a = new Book(1, "A", "B", 11, 11, 1990, 1)
        assertEquals(1990, a.getYyyy())
    }

    void testSetYyyy() {
        Book a = new Book(1, "A", "B", 11, 11, 1990, 1)
        a.setYyyy(999);
        assertEquals(999, a.getYyyy());
    }
}