/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import lab13.EggCarton;
import lab13.LetterTray;
import lab13.Lego;
import lab13.EggCarton;

/**
 *
 * @author CBADAMI
 */
public class Lab13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] objects = {new Lego(), new PogoStick(), new LetterTray(), new EggCarton()};
        for (Object o : objects) {
            if (o instanceof Lego) {
                Lego leg = (Lego) o;
                System.out.println(leg.howToCombine());
                System.out.println(leg.howToPlay());
            } else if (o instanceof PogoStick) {
                PogoStick pog = (PogoStick) o;
                System.out.println(pog.howToPlay());

            } else if (o instanceof LetterTray) {
                LetterTray lett = (LetterTray) o;
                System.out.println(lett.howToCombine());
                System.out.println(lett.holdsWhat());

            } else if (o instanceof EggCarton) {
                EggCarton egg = (EggCarton) o;
                System.out.println(egg.howToCombine());
                System.out.println(egg.howToDispose());
                System.out.println(egg.holdsWhat());
            }
        }
    }

}
