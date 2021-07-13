/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wifi.figure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Thomas
 */
public class FigureApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<Figure>();
        figures.add(new Circle(5f, 10f));
        figures.add(new Rectangle(10f, 20f, 10f));
        figures.add(new Square(10f, 10f));
        
        // Sortieren nach Fläche aufsteigend
        //Collections.sort(figures);
        
        // Sortieren nach Umfang absteigend
        /*Collections.sort(figures, new Comparator<Figure>() {
            public int compare(Figure a, Figure b) {
                if (a.calcCircumference() > b.calcCircumference()) {
                    return -1;
                } else if (a.calcCircumference() < b.calcCircumference()) {
                    return 1;
                }
                return 0;
            }
        });*/
        
        // Sortieren nach Höhe und Fläche aufsteigend
        Collections.sort(figures, new Comparator<Figure>() {
            @Override
            public int compare(Figure a, Figure b) {
                if (a.getHeight() > b.getHeight()) {
                    return 1;
                } else if (a.getHeight() < b.getHeight()) {
                    return -1;
                }
                return a.compareTo(b);
            }
            
        });
        
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
    
}
