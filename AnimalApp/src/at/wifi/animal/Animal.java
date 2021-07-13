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
public abstract class Animal {
    protected String name;
    protected float weight;

    protected Animal(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public abstract void makeNoice();
    
    @Override
    public String toString() {
        return "Name: " + this.name + ", Gewicht: " + this.weight;
    }
    
}
