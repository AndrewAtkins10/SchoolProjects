/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atkinsalab3;

import java.util.*;

/**
 *
 * @author S551050
 */
public class AtkinsALab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Dice Match");
        System.out.print("What is Player 1's first name? ");
        String player1 = input.next();
        System.out.print("What is Player 2's first name? ");
        String player2 = input.next();
        System.out.println();
        Random dice = new Random();
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int sent = 1;

        do {

            System.out.println("Here we go!");
            System.out.println();
            for (int i = 0; i < 4; i++) {
                int randomDice = dice.nextInt(6) + 1;
                if (i == 0) {
                    num1 = randomDice;
                } else if (i == 1) {
                    num2 = randomDice;
                } else if (i == 2) {
                    num3 = randomDice;
                } else {
                    num4 = randomDice;
                }
            }
            System.out.println(player1 + " " + num1 + " " + num2);
            System.out.println(player2 + " " + num3 + " " + num4);
            System.out.println("And the winner is....");
            int p1 = num1 + num2;
            int p2 = num3 + num4;
            if (p1 > p2) {
                System.out.println(player1 + " with a total of " + p1);
            } else if (p1 < p2) {
                System.out.println(player2 + " with a total of " + p2);
            } else {
                System.out.println("It's a tie!");
            }
            System.out.print("Enter 1 to play again, or 0 to quit: ");
            sent = input.nextInt();
            System.out.println();

        } while (sent != 0);
        System.out.println();
        System.out.println("Thanks for playing, goodbye!");

    }
}
