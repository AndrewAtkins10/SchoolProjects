/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

/**
 *
 * @author CBADAMI
 */
//Modify header as necessary
public class EggCarton extends Container implements Disposable {

    public String holdsWhat() {
        return "EggCarton: Holds eggs";
    }

    //Add any additional required methods here
    public String howToDispose() {
        return "Egg Carton: Try to recycle, or throw away";
    }

    public String howToCombine() {
        return "Egg Carton: Stack open cartons together";
    }

}
