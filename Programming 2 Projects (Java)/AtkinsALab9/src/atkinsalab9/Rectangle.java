/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atkinsalab9;

/**
 *
 * @author S551050
 */
public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double lengthIn) {
        length = lengthIn;
    }

    public void setWidth(double widthIn) {
        width = widthIn;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double perimeter() {
        return (length * 2 + width * 2);
    }

    public double area() {
        return length * width;
    }

    public String toString() {
        return "Length: " + length + "\nWidth: " + width;
    }

}
