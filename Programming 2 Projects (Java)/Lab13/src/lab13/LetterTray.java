/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import lab13.Container;

/**
 *
 * @author CBADAMI
 */
public class LetterTray extends Container {

    public String holdsWhat() {
        return "LetterTray: Holds letters";
    }

    //Add any additional required methods here
    public String howToCombine() {
        return "Letter Tray: Stack on top of eachother";
    }
}
