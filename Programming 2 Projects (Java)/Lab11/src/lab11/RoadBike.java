/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author CBADAMI
 */
public class RoadBike extends Bicycle {

    private String handlebarType;

    public RoadBike(String handlebars, int startCadence,
            int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        this.handlebarType = handlebars;
    }

    public void setHandlebarType(String type) {
        this.handlebarType = type;
    }

    public String toString() {
        return super.toString()
                + "\nHandelbars: " + this.handlebarType;
    }
}
