/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atkinsalab12;

/**
 *
 * @author S551050
 */
public class Car extends Vehicle {

    private double trunk;

    public Car(int year, String make, double trunk) {
        super(year, make);
        this.trunk = trunk;
    }

    public void cargo() {
        System.out.println("\n" + super.toString() + "\nTrunk space: " + trunk + " sq.ft.\n");
    }
}
