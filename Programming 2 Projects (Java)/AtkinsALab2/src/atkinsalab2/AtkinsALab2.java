/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atkinsalab2;

import java.util.Scanner;

/**
 *
 * @author S551050
 */
public class AtkinsALab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Part 1

        Scanner input = new Scanner(System.in);
        System.out.println("How long is side 1?");
        int side1 = input.nextInt();
        System.out.println("How long is side 2?");
        int side2 = input.nextInt();
        int hyp = ((side1 * side1) + (side2 * side2));
        System.out.println("The length of the hypotenuse is " + Math.sqrt(hyp));

        // Part 2
        System.out.println("Please enter your grade percentage: ");
        double grade = input.nextDouble();
        if (grade >= 90) {
            System.out.println("Your letter grade is A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("Your letter grade is B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("Your letter grade is C");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("Your letter grade is D");
        } else if (grade < 60) {
            System.out.println("Your letter garde is F");
        }
    }

}
