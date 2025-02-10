/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atkinsalab12;

/**
 *
 * @author S551050
 */
public abstract class Vehicle {

    private int year;
    private String make;

    public Vehicle(int year, String make) {
        this.year = year;
        this.make = make;
    }

    public abstract void cargo();

    public String toString() {
        return "Year: " + year + "\nMake: " + make;
    }

}
