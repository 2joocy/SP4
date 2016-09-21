/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp4;

import arrayHandler.arrayTests;

/**
 *
 * @author William
 */
public class SP4 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        arrayTests ar = new arrayTests();
        
        int[] arrayTemp = {2, 5, 2, 9, 7, 1, 100, 2, 3, 5, 77, 9, 1, 2, 6, 5};
    
        ar.printFreq(arrayTemp);
    }
    
}
