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
public class MountainBike extends Bicycle {

    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
            int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        this.seatHeight = startHeight;
    }

    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        this.seatHeight = newValue;
    }

    public String toString() {
        return super.toString()
                + "\nSeat Height: " + this.seatHeight;
    }
}
