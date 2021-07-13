/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wifi.animal;

/**
 *
 * @author Thomas
 */
public class Dog extends Animal {

    public Dog(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void makeNoice() {
        System.out.println("Wuff");
    }

    @Override
    public String toString() {
        return "Hund - " + super.toString();
    }
    
    
}
