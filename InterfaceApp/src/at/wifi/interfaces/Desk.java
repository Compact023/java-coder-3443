/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.wifi.interfaces;

/**
 *
 * @author Thomas
 */
public class Desk implements Transportable {
    protected float length;
    protected float width;
    protected float weight;
    protected float height;

    public Desk(float length, float width, float weight, float height) {
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.height = height;
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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float height() {
        return this.getHeight();
    }

    @Override
    public float length() {
        return this.getLength();
    }

    @Override
    public float width() {
        return this.getWidth();
    }

    @Override
    public float weight() {
        return this.getWeight();
    }

    @Override
    public boolean isFragile() {
        return true;
    }
    
    @Override
    public String toString() {
        return "Desk{" + "length=" + length + ", width=" + width + ", weight=" + weight + ", height=" + height + "}";
    }
    
    
}
