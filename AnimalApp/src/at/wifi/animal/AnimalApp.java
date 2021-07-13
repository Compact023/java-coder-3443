/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wifi.animal;

import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class AnimalApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Cat("Olaf", 12.0f));
        animals.add(new Dog("Bello", 20.5f));
        animals.add(new Dog("Struppi", 15.2f));
        animals.add(new Cat("Max", 5.0f));
        animals.add(new Cat("Minki", 4.6f));
        
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.makeNoice();
        }
    }
    
}
