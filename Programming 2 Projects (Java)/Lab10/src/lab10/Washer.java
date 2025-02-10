/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author CBADAMI
 */
public class Washer extends Appliance {
    
    private String capacity;
    
    public Washer(String brand, int serialNo, double price, String capacity){
        super(brand, serialNo, price);
        this.capacity = capacity;
    }

    /**
     * @return the capacity
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    
    
}
