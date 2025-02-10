/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab11;

import java.util.*;

/**
 *
 * @author S551050
 */
public class Lab11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle b1 = new MountainBike(28, 43, 3, 2);
        Bicycle b2 = new TandemBike(12, 37, 2, 1);
        Bicycle b3 = new RoadBike("flat", 40, 1, 1);
        Bicycle b4 = new RoadBike("dipped", 38, 1, 2);
        Bicycle b5 = new TandemBike(14, 35, 3, 3);
        Bicycle b6 = new MountainBike(32, 44, 2, 2);
        Bicycle b7 = new RoadBike("flat", 45, 4, 2);
        Bicycle b8 = new MountainBike(36, 48, 1, 2);
        Bicycle b9 = new TandemBike(18, 27, 3, 1);
        Bicycle b10 = new RoadBike("flat", 56, 5, 3);

        //1. Add your name and date as a comment
        //Andrew Atkins 4/10/2023
        //2. Create ArrayList here and add Bicycles
        ArrayList<Bicycle> bikes = new ArrayList<>();
        bikes.add((b1));
        bikes.add(b2);
        bikes.add((b3));
        bikes.add((b4));
        bikes.add((b5));
        bikes.add((b6));
        bikes.add((b7));
        bikes.add((b8));
        bikes.add((b9));
        bikes.add((b10));
        //3. Loop through Bicycles, make instructed changes, print
        for (Bicycle b : bikes) {
            if (b instanceof MountainBike) {
                ((MountainBike) b).setHeight(99);
                System.out.println("\nNew Mountain Bike Info: \n" + ((MountainBike) b).toString());
            } else if (b instanceof TandemBike) {
                ((TandemBike) b).setBetweenSpace(88);
                System.out.println("\nNew Tandem Bike Info: \n" + ((TandemBike) b).toString());
            } else if (b instanceof RoadBike) {
                ((RoadBike) b).setHandlebarType("NewType");
                System.out.println("\nNew Road Bike Info: \n" + ((RoadBike) b).toString());

            }

        }

    }

}
