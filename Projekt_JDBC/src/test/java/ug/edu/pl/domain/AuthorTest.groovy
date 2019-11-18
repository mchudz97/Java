package ug.edu.pl.domain

import org.junit.Test

import static junit.framework.TestCase.assertEquals
import static junit.framework.TestCase.assertEquals
import static junit.framework.TestCase.assertEquals

class AuthorTest extends GroovyTestCase {
    @Test
    public void Author_Check_Full_Date(){
        Author a= new Author(1, "Jan", "Nowak",11,11,1990   );
        assertEquals("1990-11-11",a.getDate());

    }

    public void Author_Check_Date_Day(){
        Author a= new Author(1, "Jan", "Nowak",1,11,1990   );
        assertEquals("01", a.getDate().substring(8,10));
    }

    public void Author_Check_Date_Month(){
        Author a= new Author(1, "Jan", "Nowak",11,1,1990   );
        assertEquals("01", a.getDate().substring(5,7));
    }

    void testGetId() {
        Author a= new Author(1, "Jan", "Nowak",11,11,1990   );
        assertEquals(1, a.getId());
    }

    void testSetId() {
        Author a= new Author(1, "Jan", "Nowak",11,11,1990   );
        a.setId(100);
        assertEquals(100,a.getId());
    }

    void testGetName() {
        Author a= new Author(1, "Jan", "Nowak",11,11,1990   );
        assertEquals("Jan", a.getName());
    }

    void testSetName() {
        Author a= new Author(1, "Jan", "Nowak",11,11,1990   );
        a.setName("Piotr");
        assertEquals("Piotr", a.getName());
    }

    void testGetPername() {
        Author a= new Author(1, "Jan", "Nowak",11,11,1990   );
        assertEquals("Nowak",a.getPername());
    }

    void testSetPername() {
        Author a= new Author(1, "Jan", "Nowak",11,11,1990   );
        a.setPername("Kwasniewski");
        assertEquals("Kwasniewski", a.getPername());
    }

    void testGetDd() {
        Author a= new Author(1, "Jan", "Nowak",11,11,1990   );
        assertEquals(11,a.getDd());
    }

    void testSetDd() {
        Author a= new Author(1, "Jan", "Nowak",11,11,1990   );
        a.setDd(30);
        assertEquals(30,a.getDd())
    }

    void testGetMm() {
        Author a= new Author(1, "Jan", "Nowak",11,11,1990   );
        assertEquals(11,a.getMm());
    }

    void testSetMm() {
        Author a= new Author(1, "Jan", "Nowak",11,11,1990   );
        a.setMm(1);
        assertEquals(1, a.getMm());
    }

    void testGetYyyy() {
        Author a= new Author(1, "Jan", "Nowak",11,11,1990   );
        assertEquals(1990, a.getYyyy())
    }

    void testSetYyyy() {
        Author a= new Author(1, "Jan", "Nowak",11,11,1990   );
        a.setYyyy(999);
        assertEquals(999, a.getYyyy());
    }
}
