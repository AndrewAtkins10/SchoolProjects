/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project02startingfiles;

/**
 *
 * @author S551050
 */
public class Faculty extends Employee {

    private double annualSalary;
    private int weeksPerYear;
    private String department;
//Contructor

    public Faculty(String name, int number, boolean working, double salary, int weeks, String dept) {
        super(name, number, working);
        this.annualSalary = salary;
        this.weeksPerYear = weeks;
        this.department = dept;
    }
//other methods

    public String toString() {
        return super.toString() + "\t" + annualSalary + "\t " + weeksPerYear + "\t" + department;
    }

    public double getPay() {
        return (annualSalary * 2) / weeksPerYear;
    }
}
