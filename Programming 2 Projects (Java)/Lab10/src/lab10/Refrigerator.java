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
public class Refrigerator extends Appliance{
    private boolean iceMaker;
    
    public Refrigerator(String brand, int serialNo, double price,
                            boolean iceMaker){
        super(brand, serialNo, price);
        this.iceMaker = iceMaker;
    }

    /**
     * @return the iceMaker
     */
    public boolean hasIceMaker() {
        return iceMaker;
    }

    /**
     * @param iceMaker the iceMaker to set
     */
    public void setIceMaker(boolean iceMaker) {
        this.iceMaker = iceMaker;
    }
    
    
}
