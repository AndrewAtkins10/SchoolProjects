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
//Modify the header as necessary
public class Lego extends Toy implements Combineable {

    public String howToPlay() {
        return "Lego: Build things!";
    }

    //Add any additional required methods here
    public String howToCombine() {
        return "Lego: Snap brick studs to brick bottom";
    }
}
