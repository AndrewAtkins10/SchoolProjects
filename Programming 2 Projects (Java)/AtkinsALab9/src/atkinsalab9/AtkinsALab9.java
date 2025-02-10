/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atkinsalab9;

/**
 *
 * @author S551050
 */
public class AtkinsALab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4.0, 5.0);
        Rectangle rectangle2 = new Rectangle(2.5, 6.3);
        System.out.println("Rdctangle 1 details: ");
        System.out.println(rectangle1.toString());
        System.out.println("\nThe area of rectangle 1 is: " + rectangle1.area());
        System.out.println("The perimeter of rectangle 1 is: " + rectangle1.perimeter());

        System.out.println("\nRectangle 2 details: ");
        System.out.println(rectangle2.toString());
        System.out.println("\nThe area of rectangle 2 is: " + rectangle2.area());
        System.out.println("The perimeter of rectangle 2 is: " + rectangle2.perimeter());

        System.out.println("Change rectangle 1s value to 7.0...");
        rectangle1.setWidth(7.0);
        System.out.println("\nRectangle 1: ");
        System.out.println(rectangle1.toString());
        System.out.println("\nThe area of rectangle 1 is: " + rectangle1.area());
        System.out.println("The perimeter of rectangle 1 is: " + rectangle1.perimeter());
    }

}
