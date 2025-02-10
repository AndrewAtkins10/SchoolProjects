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
public class TandemBike extends Bicycle {

    private int betweenSpace;

    public TandemBike(int betweenSpace, int startCadence,
            int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        this.betweenSpace = betweenSpace;
    }

    public void setBetweenSpace(int newSpace) {
        this.betweenSpace = newSpace;
    }

    public String toString() {
        return super.toString()
                + "\nBetween Space: " + this.betweenSpace;
    }
}
