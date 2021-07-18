/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wifi.library;

import at.wifi.library.model.Author;
import at.wifi.library.model.Library;
import at.wifi.library.model.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas
 */
public class LibraryApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Library library = new Library();
        
        List<Author> authors = new ArrayList<Author>();
        authors.add(new Author(1, "Max", "Musteramm"));
        authors.add(new Author(2, "Susi", "Musterfrau"));
        authors.add(new Author(3, "John", "Doe"));
        authors.add(new Author(4, "Jane", "Doe"));
        library.setAuthors(authors);
        
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Maxi", "Maier", "maxi.maier@test.at"));
        students.add(new Student(2, "Babsi", "Müller", "babsi.mueller@test.at"));
        students.add(new Student(3, "Gabi", "Maier", "gabi.maier@test.at"));
        library.setStudents(students);
        
        List<Author> book1Authors = new ArrayList<Author>();
        book1Authors.add(authors.get(0));
        library.addBook("Der Herr der Ringe", "9123-1233-3333", book1Authors, "Auflage 1", "Mustermann Verlag");
        
        List<Author> book2Authors = new ArrayList<Author>();
        book2Authors.add(authors.get(1));
        book2Authors.add(authors.get(2));
        library.addBook("Die Schattenkinder", "2222-2222-2222", book2Authors, "Auflage 2", "Musterfrau Verlag");
        
        List<Author> book3Authors = new ArrayList<Author>();
        book3Authors.add(authors.get(3));
        library.addBook("Biene Maja", "3333-3333-3333", book3Authors, "Auflage 3", "Biene Maja Verlag");
        
        System.out.println(library);
        
        if (library.lendBook("3333-3333-3333", 2)) {
            System.out.println("Das Buch mit der ISBN 3333-3333-3333 wurde verliehen");
        } else {
            System.out.println("Das Buch mit der ISBN 3333-3333-3333 konnte nicht verliehen werden");
        }
        
        if (library.lendBook("3333-3333-3333", 3)) {
            System.out.println("Das Buch mit der ISBN 3333-3333-3333 wurde verliehen");
        } else {
            System.out.println("Das Buch mit der ISBN 3333-3333-3333 konnte nicht verliehen werden");
        }
        
        if (library.returnBook("3333-3333-3333")) {
            System.out.println("Das Buch mit der ISBN 3333-3333-3333 wurde zurückgegeben");
        } else {
            System.out.println("Das Buch mit der ISBN 3333-3333-3333 konnte nicht zurückgegeben werden");
        }
        
        if (library.returnBook("3333-3333-3333")) {
            System.out.println("Das Buch mit der ISBN 3333-3333-3333 wurde zurückgegeben");
        } else {
            System.out.println("Das Buch mit der ISBN 3333-3333-3333 konnte nicht zurückgegeben werden");
        }
    }
    
}
