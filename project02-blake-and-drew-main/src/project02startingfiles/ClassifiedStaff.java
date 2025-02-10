/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author S551050
 */
public class ClassifiedStaff extends Employee {

    private double weeklySalary;
    private String division;
//Constructor

    public ClassifiedStaff(String name, int number, boolean working, double salary, String div) {
        super(name, number, working);
        this.weeklySalary = salary;
        this.division = div;
    }
//Other Methods

    public String toString() {
        return super.toString() + "\t" + weeklySalary + "\t " + division;
    }

    public double getPay() {
        return weeklySalary * 2;
    }
}
