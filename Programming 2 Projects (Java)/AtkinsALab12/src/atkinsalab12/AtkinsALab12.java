/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atkinsalab12;

/**
 *
 * @author S551050
 */
public class AtkinsALab12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car1 = new Car(2015, "Toyota", 20.0);
        Truck truck1 = new Truck(2019, "Ford", "1/2");
        car1.cargo();
        truck1.cargo();
    }

}
