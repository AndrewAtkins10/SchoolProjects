/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atkinsalab5;

import java.util.*;

/**
 *
 * @author S551050
 */
public class AtkinsALab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] juice = new double[10];
        Random rand = new Random();
        for (int i = 0; i < juice.length; i++) {
            juice[i] = rand.nextFloat();
        }
        System.out.println("Original Order:");
        for (double d : juice) {
            System.out.println(d);
        }
        System.out.println("");
        Arrays.sort(juice);
        System.out.println("Sorted Order:");
        for (double d : juice) {
            System.out.println(d);
        }
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("");
        System.out.println("Now lets talk about Animals");

        for (int i = 0; i < 5; i++) {
            System.out.print("Name five animals: ");
            String namess = input.next();
            if (i == 0) {
                names[0] = namess;
            }
            if (i == 1) {
                names[1] = namess;
            }
            if (i == 2) {
                names[2] = namess;
            }
            if (i == 3) {
                names[3] = namess;
            }
            if (i == 4) {
                names[4] = namess;
            }
        }
        Arrays.sort(names);
        System.out.println("Your animals in alphabetical order, are: ");
        for (String animals : names) {
            Juicer(animals);
        }
    }

    public static void Juicer(String animals) {
        int varcount = 0;
        for (int i = 0; i < animals.length(); i++) {
            if (animals.charAt(i) == 'a' || animals.charAt(i) == 'e' || animals.charAt(i) == 'i'
                    || animals.charAt(i) == 'o' || animals.charAt(i) == 'u') {
                varcount += 1;
            }
        }
        System.out.println(animals + ", which contains " + varcount + " vowels");

    }
}
