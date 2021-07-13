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
public class Circle extends Figure {
    protected float radius;

    public Circle(float radius, float height) {
        super(height);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    
    public float getDiameter() {
        return this.radius * 2;
    }
    
    public void setDiameter(float diameter) {
        this.radius = diameter / 2;
    }
    
    @Override
    public float calcArea() {
        return (float) (Math.pow(this.radius, 2) * Math.PI);
    }

    @Override
    public float calcCircumference() {
        return (float) (2 * this.radius * Math.PI);
    }

    @Override
    public String toString() {
        return "Circle (radius=" + this.radius + ") " + super.toString();
    }

}
