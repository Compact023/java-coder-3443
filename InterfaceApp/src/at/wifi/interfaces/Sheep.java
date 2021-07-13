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
public class Sheep implements Transportable {
    protected String name;
    protected float weight;
    protected float length;
    protected float width;
    protected float height;
    protected String breed;

    public Sheep(String name, float weight, float length, float width, float height, String breed) {
        this.name = name;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.breed = breed;
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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public float height() {
        return this.getHeight();
    }

    @Override
    public float width() {
        return this.getWidth();
    }

    @Override
    public float length() {
        return this.getLength();
    }

    @Override
    public float weight() {
        return this.getWeight();
    }

    @Override
    public boolean isFragile() {
        return false;
    }
    
    @Override
    public String toString() {
        return "Sheep{" + "name=" + name + ", weight=" + weight + ", length=" + length + ", width=" + width + ", height=" + height + ", breed=" + breed + "}";
    }
    
    
}
