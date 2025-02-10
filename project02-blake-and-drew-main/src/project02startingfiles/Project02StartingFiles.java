/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project02startingfiles;

import java.io.*;
import java.util.*;

/**
 *
 * @author dianar
 */
public class Project02StartingFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //open scanner
        Scanner input = new Scanner(System.in);

        //Prompt user
        System.out.print("Enter the number of students in the file: ");
        int stud = input.nextInt();

        System.out.print("Enter the number of staff in the file: ");
        int staff = input.nextInt();

        System.out.print("Enter the number of faculty in the file: ");
        int fac = input.nextInt();

        //call file
        System.out.print("Enter the name of the file: ");
        String fileName = input.next();

        File inputFile = new File(fileName);
        Scanner input1 = new Scanner(inputFile);

        //read the number of lines then create array based off num of entries
        int numInFile = stud + staff + fac;
        Employee[] worker = new Employee[numInFile];

        //While  loop to run through file and store in an array
        int i = 0;
        while (input1.hasNextLine()) {
            //figure out if information from file belongs in student, classified staff, or faculty
            String type = input1.nextLine();
            String[] category = type.split(",");

            //if, elseif, else statements to store student, staff, facutly
            //Adds a student to the array
            if (i < stud) {
                //Student Employee
                String name = category[0];
                int number = Integer.parseInt(category[1]);
                boolean working = Boolean.parseBoolean(category[2]);
                int hoursWorked = Integer.parseInt(category[3]);
                boolean workStudy = Boolean.parseBoolean(category[4]);
                double payRate = Double.parseDouble(category[5]);
                worker[i] = new StudentEmployee(name, number, working, hoursWorked, workStudy, payRate);
            } //Adds a staff member to the array
            else if (i < stud + staff) {
                //Classified Staff
                String name = category[0];
                int number = Integer.parseInt(category[1]);
                boolean working = Boolean.parseBoolean(category[2]);
                double weeklySalary = Double.parseDouble(category[3]);
                String division = category[4];
                worker[i] = new ClassifiedStaff(name, number, working, weeklySalary, division);

            } //Adds an faculty to the array
            else {
                //Faculty
                String name = category[0];
                int number = Integer.parseInt(category[1]);
                boolean working = Boolean.parseBoolean(category[2]);
                double annualSalary = Integer.parseInt(category[3]);
                int weeksPerYear = Integer.parseInt(category[4]);
                String department = category[5];
                worker[i] = new Faculty(name, number, working, annualSalary, weeksPerYear, department);

            }
            i++;

        }

        //close file and print out array
        input1.close();
        System.out.println();
        for (Employee item : worker) { //Iterate through loop
            System.out.println(item);
        }
        System.out.println();
        System.out.println("Pay for two-week pay period \n===========================");
        //loop to display employee name and their two-week pay for currently working employees
        for (int x = 0; x < worker.length; x++) {
            if (worker[x].isIsWorking() == true) {
                System.out.printf("%-15s \t$ %.2f", worker[x].getEmployeeName(), worker[x].getPay());
                System.out.println();
            }
        }
    }
}
