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
public class Cat extends Animal {

    public Cat(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void makeNoice() {
        System.out.println("Miau");
    }
    
    @Override
    public String toString() {
        return "Katze - " + super.toString();
    }
}
