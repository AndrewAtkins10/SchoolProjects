/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atkinsalab07;

import java.io.*;
import java.util.*;

/**
 *
 * @author S551050
 */
public class AtkinsALab07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("population by zip.txt");

        Scanner input = new Scanner(inputFile);
        PrintWriter outputFile = new PrintWriter("dataSwitch.txt");
        int count = 0;
        while (input.hasNext()) {
            String fnum = input.next();
            String lnum = input.next();
            outputFile.print(lnum + " " + fnum + "\n");
            count += 1;

        }
        outputFile.print("The file had " + count + " lines");
        outputFile.close();
        input.close();

    }
}
