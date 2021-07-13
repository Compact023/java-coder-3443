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
public class Rectangle extends Figure {
    protected float length;
    protected float width;

    public Rectangle(float length, float width, float height) {
        super(height);
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    
    @Override
    public float calcArea() {
        return this.length * this.width;
    }

    @Override
    public float calcCircumference() {
        return (this.length + this.width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle (length=" + length + ", width=" + width + ") " + super.toString();
    }
    
}
