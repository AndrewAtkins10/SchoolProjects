/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atkinsalab12;

/**
 *
 * @author S551050
 */
public class Truck extends Vehicle {

    private String bed;

    public Truck(int year, String make, String bed) {
        super(year, make);
        this.bed = bed;
    }

    public void cargo() {
        System.out.println("\n" + super.toString() + "\nBed capacity: " + bed + " ton\n");
    }

}
