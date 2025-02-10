/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10;

/**
 *
 * @author S551050
 */
public class Lab10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Andrew Atkins 4/2/2023
        Refrigerator fridgeA = new Refrigerator("Frigidaire", 567, 1200.00, true);
        Refrigerator fridgeB = new Refrigerator("Maytag", 947, 1095.00, false);
        Washer washerA = new Washer("Whirlpool", 3478, 9999.00, "Medium");
        Washer washerB = new Washer("Maytag", 4529, 2499.00, "Extra Large");
        System.out.println("Refrigerator info:\n");
        System.out.printf("FridgeA: \nBrand: %s \nSerial #: %d \nPrice: %.2f\nHas ice maker?%b\n", fridgeA.getBrand(), fridgeA.getSerialNo(), fridgeA.getPrice(), fridgeA.hasIceMaker());
        System.out.println("");
        System.out.printf("FridgeB: \nBrand: %s \nSerial #: %d \nPrice: %.2f\nHas ice maker?%b\n", fridgeB.getBrand(), fridgeB.getSerialNo(), fridgeB.getPrice(), fridgeB.hasIceMaker());
        System.out.println("");
        System.out.println("Washer info:\n");
        System.out.printf("Washer A: \nBrand: %s \nSerial #: %d \nPrice: %.2f\nHas ice maker?%b \n", washerA.getBrand(), washerA.getSerialNo(), washerA.getPrice(), washerA.getCapacity());
        System.out.printf("\nWasher B: \nBrand: %s \nSerial #: %d \nPrice: %.2f\nHas ice maker?%b \n", washerB.getBrand(), washerB.getSerialNo(), washerB.getPrice(), washerB.getCapacity());

    }

}
