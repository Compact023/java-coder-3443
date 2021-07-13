/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wifi.figure;

/**
 *
 * @author Thomas
 */
public abstract class Figure implements Comparable<Figure> {
    protected float height;

    protected Figure(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
    public abstract float calcArea();
    
    public abstract float calcCircumference();
    
    public float calcVolume() {
        return this.calcArea() * this.height;
    }

    @Override
    public String toString() {
        return "Höhe: " + this.height + ", Fläche: " + this.calcArea() + ", Umfang: " + this.calcCircumference() + ", Volumen: " + this.calcVolume();
    }

    @Override
    public int compareTo(Figure other) {
        /*
            objekt a und objekt b
            a > b => 1
            a < b => -1
            a == b => 0
        */
        
        if (this.calcArea() > other.calcArea()) {
            return 1;
        } else if (this.calcArea() < other.calcArea()) {
            return -1;
        }
        return 0;
    }
}
