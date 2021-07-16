/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wifi.library.model;

import java.util.List;

/**
 *
 * @author Thomas
 */
public class Book {
    private String title;
    private String isbn;
    private List<Author> authors;
    private String publisher;
    private String edition;
    private Student currentStudent;

    public Book(String title, String isbn, List<Author> authors, String publisher, String edition) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
        this.publisher = publisher;
        this.edition = edition;
        this.currentStudent = null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public Student getCurrentStudent() {
        return currentStudent;
    }

    public void setCurrentStudent(Student currentStudent) {
        this.currentStudent = currentStudent;
    }
    
    public boolean isAvailable() {
        if (this.currentStudent == null) {
            return true;
        }
        return false;
        
        // return (this.currentStudent == null ? true : false);
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", isbn=" + isbn + ", publisher=" + publisher + ", edition=" + edition + '}';
    }
}
