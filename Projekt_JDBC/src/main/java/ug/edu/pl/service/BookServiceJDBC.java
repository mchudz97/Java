package ug.edu.pl.service;

import ug.edu.pl.domain.Book;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;



public class BookServiceJDBC implements BookService {


    private final String DB_URL="jdbc:hsqldb:hsql://localhost/workdb";
    private final String CREATE_IF_NOT_EXIST="CREATE TABLE IF NOT EXISTS BOOK (id INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1, INCREMENT BY 1) PRIMARY KEY," +
            " title VARCHAR(50) DEFAULT NULL, publishing VARCHAR(50) DEFAULT NULL, " +
            "premiere DATE DEFAULT NULL, author_id INTEGER DEFAULT NULL, FOREIGN KEY (author_id) REFERENCES AUTHOR(id))";
    private final String INSERT_BOOK="INSERT INTO BOOK(title, publishing, premiere, author_id) VALUES (?,?,?,?)";
    private final String SELECT_BOOKS="SELECT * FROM BOOK";
    private final String SELECT_FROM_AUTHOR="SELECT * FROM BOOK WHERE author_id=?";
    private final String DELETE_BY_ID="DELETE FROM BOOK WHERE id=?";
    private final String UPDATE_BY_ID="UPDATE BOOK SET title=?, publishing=?, premiere=?, author_id=? WHERE id=? ";
    private final String DROP_TABLE="DROP TABLE IF EXISTS BOOK";
    private Connection con;
    private PreparedStatement insertB;
    private PreparedStatement selectB;
    private PreparedStatement selectByAuthor;
    private PreparedStatement deleteB;
    private PreparedStatement updateB;
    private PreparedStatement dropB;
    public BookServiceJDBC(){
        try {
            con = DriverManager.getConnection(DB_URL);
            PreparedStatement createTableBook = con.prepareStatement(CREATE_IF_NOT_EXIST);
            createTableBook.executeUpdate();
            createTableBook.close();

            insertB=con.prepareStatement(INSERT_BOOK);
            selectB=con.prepareStatement(SELECT_BOOKS);
            selectByAuthor=con.prepareStatement(SELECT_FROM_AUTHOR);
            dropB=con.prepareStatement(DROP_TABLE);
            updateB=con.prepareStatement(UPDATE_BY_ID);
            deleteB=con.prepareStatement(DELETE_BY_ID);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateBook(int idB, Book b){
        try {

            updateB.setString(1, b.getTitle());
            updateB.setString(2, b.getPublishing());
            updateB.setString(3, b.getDate());
            updateB.setString(4,  Integer.toString(b.getAuthor_id()));
            updateB.setString(5,  Integer.toString(idB));
            updateB.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public int deleteBook(int idB) {


        try {
            deleteB.setString(1, Integer.toString(idB));
            return deleteB.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int dropBook(){
        try {
            return dropB.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int addBook(Book b) {
        try {
            insertB.setString(1, b.getTitle());
            insertB.setString(2, b.getPublishing());
            insertB.setString(3, b.getDate());
            insertB.setString(4, Integer.toString(b.getAuthor_id()));
            int affected=insertB.executeUpdate();
            return affected;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    public List<Book> getFromAuthor(int idA){

        try {
            List<Book> result= new ArrayList<Book>(0);
            selectByAuthor.setString(1,Integer.toString(idA) );
            ResultSet rs = selectByAuthor.executeQuery();
            while(rs.next()){
                int id= rs.getInt("id");
                String title= rs.getString("title");
                String publishing= rs.getString("publishing");
                String premiere= rs.getDate("premiere").toString();
                String[] parts = premiere.split("-");
                int idAuthor=rs.getInt("author_id");
                result.add(new Book(id, title, publishing, Integer.parseInt(parts[2]), Integer.parseInt(parts[1]), Integer.parseInt(parts[0]), idAuthor));
            }
            rs.close();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Book> getBooks() {
        List<Book> result= new ArrayList<Book>(0);
        try {
            ResultSet rs = selectB.executeQuery();
            while(rs.next()){
                int id= rs.getInt("id");
                String title= rs.getString("title");
                String publishing= rs.getString("publishing");
                String premiere= rs.getDate("premiere").toString();
                String[] parts = premiere.split("-");
                int idAuthor=rs.getInt("author_id");
                result.add(new Book(id, title, publishing, Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), idAuthor));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public int addBooks(List<Book> books) {
        try {
            int affected=0;
            con.setAutoCommit(false);
            for (Book b:books) {
                affected+=this.addBook(b);

            }
            con.commit();
            con.setAutoCommit(true);
            return affected;
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();
        }
        return -1;
    }
}
