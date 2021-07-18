/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wifi.library.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas
 */
public class Student {
    private long studentId;
    private String firstName;
    private String lastName;
    private String email;
    private List<Book> books;

    public Student(long studentId, String firstName, String lastName, String email) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.books = new ArrayList<Book>();
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> myBooks() {
        return books;
    }
    
    public void addBookToMyBooks(Book book) {
        this.books.add(book);
    }
    
    public void removeBookFromMyBooks(Book deleteBook) {
        this.books.remove(deleteBook);
    }
    
    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + '}';
    }
    
    
}
