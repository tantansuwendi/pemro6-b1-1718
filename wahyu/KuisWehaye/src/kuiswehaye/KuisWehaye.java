/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kuiswehaye;

import java.awt.Frame;

/**
 *
 * @author hp
 */
public class KuisWehaye {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Canvasnya cv = new Canvasnya();
        Canvaslagi cv = new Canvaslagi();
        Frame fr = new Frame();
        
        fr.add(cv);
        fr.setSize(300, 300);
        fr.setVisible(true);
    }
    
}
