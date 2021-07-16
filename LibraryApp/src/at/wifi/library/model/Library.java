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
public class Library {
    private List<Book> books;
    private List<Author> authors;
    private List<Student> students;

    public Library() {
        this.books = new ArrayList<Book>();
        this.authors = new ArrayList<Author>();
        this.students = new ArrayList<Student>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    
    @Override
    public String toString() {
        return "Library{" + "books=" + books.size() + ", authors=" + authors.size() + ", students=" + students.size() + '}';
    }
    
    /**
     * Buch zur Bibliothek hinzufügen, sofern es noch nicht existiert
     * 
     * @param title
     * @param isbn
     * @param authors
     * @param edition
     * @param publisher
     * @return 
     */
    public boolean addBook(String title, String isbn, List<Author> authors, String edition, String publisher) {
        // 1. Überprüfung ob das Buch schon vorhanden ist
        if (this.bookAlreadyExists(isbn)) {
            return false;
        } else {
            // 2. Buch anlegen und zur Bibliothek hinzufügen
            Book newBook = new Book(title, isbn, authors, publisher, edition);
            this.books.add(newBook);
            return true;
        }
    }
    
    
    public boolean lendBook(String isbn, long studentId) {
        // 1. Buch aus Liste holen
        Book book = this.getBookByIsbn(isbn);
        
        // 2. Student aus Liste der Studenten holen
        Student student = this.getStudentById(studentId);
        
        // wenn das Buch existiert und der Student existiert und das Buch verfügbar ist (nicht ausgeliehen)
        if (book != null && student != null && book.isAvailable()) {
            // 3. beim Buch den Studenten hinterlegen, der sich das Buch ausgeliehen hat
            book.setCurrentStudent(student);

            // 4. beim Studenten müssen wir das Buch, dass er sich ausgeliehen hat, hinzufügen
            student.addBookToMyBooks(book);
            
            return true;
        }
        return false;
    }
        

    public boolean returnBook(String isbn) {
        // 1. Buch aus Liste holen
        Book book = this.getBookByIsbn(isbn);
        
        // Wenn das Buch existiert und ausgeliehen ist (nicht verfügbar)
        if (book != null && !book.isAvailable()) {
            Student student = book.getCurrentStudent();
            
            // 2. beim Studenten müssen wir das Buch, dass er zurück gegeben hat, entfernen
            student.removeBookFromMyBooks(book);
        
            // 3. beim Buch muss der Student auf "null" gesetzt werden => das Buch ist wieder verfügbar
            book.setCurrentStudent(null);
            
            return true;
        }
        return false;
    }
    
            
    /**
     * Überprüft, ob ein Buch mit einer angegebenen ISBN bereits existiert
     * 
     * @param isbn
     * @return 
     */
    protected boolean bookAlreadyExists(String isbn) {
        for (Book book : this.books) {
            if (book.getIsbn().equals(isbn)) {
                return true;
            }
        }
        return false;
    }
    
    protected Book getBookByIsbn(String isbn) {
        // Durchlaufen aller Bücher, wobei bei jedem Durchlauf ein Buch in die Variable "book" gespeichert wird
        for (Book book : this.books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
    
    protected Student getStudentById(long studentId) {
        for (Student student : this.students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }
}
