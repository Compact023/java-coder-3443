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
public class Square extends Rectangle {

    public Square(float length, float height) {
        super(length, length, height);
    }

    @Override
    public void setLength(float length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(float width) {
        this.length = width;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square (length=" + this.length + ") Höhe: " + this.height +  ", Fläche: " + this.calcArea() + ", Umfang: " + this.calcCircumference() + ", Volumen: " + this.calcVolume();
    }
    
    
}
