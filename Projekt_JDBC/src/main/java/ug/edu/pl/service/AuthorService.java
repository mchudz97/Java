package ug.edu.pl.service;

import ug.edu.pl.domain.Author;

import java.util.List;

public interface AuthorService {
    public int addAuthor(Author a);
    public List<Author> getAuthors();
    public int addAuthors(List<Author> authors);

}
